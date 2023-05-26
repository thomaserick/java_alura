package br.com.tef.alurafood.service;


import br.com.tef.alurafood.dto.PagamentoDTO;
import br.com.tef.alurafood.model.Pagamento;
import br.com.tef.alurafood.model.enums.Status;
import br.com.tef.alurafood.repository.PagamentoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public Slice<PagamentoDTO> getAll(Pageable pageable){
        return repository.findAll(pageable).map(pagamento -> modelMapper.map(pagamento, PagamentoDTO.class));
    }

    public PagamentoDTO getById(Long id)
    {
        Pagamento pagamento = repository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return modelMapper.map(pagamento, PagamentoDTO.class);
    }

    public PagamentoDTO insert(PagamentoDTO dto)
    {
        Pagamento pagamento = modelMapper.map(dto,Pagamento.class);
        pagamento.setStatus(Status.CRIADO);
        pagamento.setDataCriacao(ZonedDateTime.now());
        repository.save(pagamento);

        return modelMapper.map(pagamento,PagamentoDTO.class);
    }

    public PagamentoDTO update(Long id, PagamentoDTO dto) {
        Pagamento pagamento = modelMapper.map(dto, Pagamento.class);
        pagamento.setId(id);
        pagamento = repository.save(pagamento);
        return modelMapper.map(pagamento, PagamentoDTO.class);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }


}
