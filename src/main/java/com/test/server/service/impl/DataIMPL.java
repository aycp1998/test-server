package com.test.server.service.impl;

import com.test.server.dto.DataDTO;
import com.test.server.model.Data;
import com.test.server.repository.DataRepository;
import com.test.server.response.payload.GenericMessage;
import com.test.server.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DataIMPL implements DataService {

    @Autowired
    private DataRepository dataRepository;

    @Override
    public GenericMessage getAllData() {
        return new GenericMessage("Datos obtenidos", dataRepository.findAll());
    }

    @Override
    public GenericMessage getDataById(Long id) {
        Optional<Data> optionalData = dataRepository.findById(id);
        if (optionalData.isPresent()) {
            return new GenericMessage("Datos obtenidos mediante su identificador " + id, optionalData.get());
        } else {
            return new GenericMessage("Datos no encontrados mediante su identificador " + id);
        }
    }

    @Override
    public GenericMessage createData(DataDTO dataDTO) {
        Data data = new Data(
                dataDTO.getName(),
                dataDTO.getAge(),
                dataDTO.getCountry()
        );
        return new GenericMessage("Datos creados", dataRepository.save(data));
    }

    @Override
    public GenericMessage updateData(DataDTO dataDTO) {
        if (dataRepository.existsById(dataDTO.getId())) {
            Data data = new Data(
                    dataDTO.getId(),
                    dataDTO.getName(),
                    dataDTO.getAge(),
                    dataDTO.getCountry()
            );
            return new GenericMessage("Datos actualizados", dataRepository.save(data));
        } else {
            return new GenericMessage("Datos no encontrados");
        }
    }

    @Override
    public GenericMessage deleteDataById(Long id) {
        dataRepository.deleteById(id);
        return new GenericMessage("Datos eliminados mediante su identificador " + id);
    }

    @Override
    public GenericMessage deleteAllData() {
        dataRepository.deleteAll();
        return new GenericMessage("Todos los datos han sido eliminados");
    }

}
