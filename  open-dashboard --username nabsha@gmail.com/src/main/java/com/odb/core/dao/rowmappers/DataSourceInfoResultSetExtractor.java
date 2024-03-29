/*******************************************************************************
 * Copyright (c) 2012, Nabeel Shaheen	
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted
 ******************************************************************************/
package com.odb.core.dao.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.odb.core.dao.dto.DataSourceInfo;


/**
 * The Class DataSourceInfoResultSetExtractor.
 */
public class DataSourceInfoResultSetExtractor implements ResultSetExtractor<DataSourceInfo>{

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.ResultSetExtractor#extractData(java.sql.ResultSet)
	 */
	public DataSourceInfo extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		DataSourceInfo dsInfo = null;
		if(rs.next()){
			dsInfo = new DataSourceInfo();
			dsInfo.setDataSourceID(rs.getString("DATASOURCE_ID"));
			dsInfo.setDataSourceName(rs.getString("DATASOURCE_NAME"));
			dsInfo.setPublisherID(rs.getString("PUBLISHER_ID"));
			dsInfo.setTimeoutInterval(rs.getLong("TIMEOUT_INTERVAL"));
			dsInfo.setSeriesCount(rs.getInt("NUM_OF_SERIES"));
		}
		return dsInfo;
	}


}
