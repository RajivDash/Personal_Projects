package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Convert;

public interface ConvertService {
	public void saveConfirms(Convert convert);

	public List<Convert> getAllList();

	public Convert getConvertById(long id);
}
