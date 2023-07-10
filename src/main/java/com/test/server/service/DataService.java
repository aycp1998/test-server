package com.test.server.service;

import com.test.server.dto.DataDTO;
import com.test.server.response.payload.GenericMessage;

public interface DataService {

    GenericMessage getAllData();

    GenericMessage getDataById(Long id);

    GenericMessage createData(DataDTO dataDTO);

    GenericMessage updateData(DataDTO dataDTO);

    GenericMessage deleteDataById(Long id);

    GenericMessage deleteAllData();

}
