package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Convert;
import com.zohocrm.repository.ConvertRepository;

@Service
public class ConvertServiceImpl implements ConvertService {

	@Autowired
	private ConvertRepository convertrepo;
	
	@Override
	public void saveConfirms(Convert convert) {
		convertrepo.save(convert);
	}

	@Override
	public List<Convert> getAllList() {
		List<Convert> converts = convertrepo.findAll();
		return converts;
	}

	@Override
	public Convert getConvertById(long id) {
		Optional<Convert> findById = convertrepo.findById(id);
		return findById.get();
	}

}
