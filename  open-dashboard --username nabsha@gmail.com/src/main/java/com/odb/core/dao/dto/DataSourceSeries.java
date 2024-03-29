/*******************************************************************************
 * Copyright (c) 2012, Nabeel Shaheen	
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted
 ******************************************************************************/
package com.odb.core.dao.dto;

import java.sql.Timestamp;

/**
 * The Class DataSourceSeries.
 * 
 * this class is a DTO
 */
public class DataSourceSeries {
	
	/** The data source id. */
	private String dataSourceID;
	
    private Timestamp dateTime;
    
	/** The series index. */
	private String seriesIndex;
	
	/** The series index seq. */
	private long seriesIndexSeq;
	
	/** The series index seq val. */
	private double seriesIndexSeqVal;

	/**
	 * Gets the series index seq.
	 *
	 * @return the series index seq
	 */
	public long getSeriesIndexSeq() {
		return seriesIndexSeq;
	}
	
	/**
	 * Sets the series index seq.
	 *
	 * @param seriesIndexSeq the new series index seq
	 */
	public void setSeriesIndexSeq(long seriesIndexSeq) {
		this.seriesIndexSeq = seriesIndexSeq;
	}
	
	/**
	 * Gets the series index seq val.
	 *
	 * @return the series index seq val
	 */
	public double getSeriesIndexSeqVal() {
		return seriesIndexSeqVal;
	}
	
	/**
	 * Sets the series index seq val.
	 *
	 * @param seriesIndexSeqVal the new series index seq val
	 */
	public void setSeriesIndexSeqVal(double seriesIndexSeqVal) {
		this.seriesIndexSeqVal = seriesIndexSeqVal;
	}
	
	/**
	 * Gets the data source id.
	 *
	 * @return the data source id
	 */
	public String getDataSourceID() {
		return dataSourceID;
	}
	
	/**
	 * Sets the data source id.
	 *
	 * @param dataSourceID the new data source id
	 */
	public void setDataSourceID(String dataSourceID) {
		this.dataSourceID = dataSourceID;
	}
	
	/**
	 * Gets the series index.
	 *
	 * @return the series index
	 */
	public String getSeriesIndex() {
		return seriesIndex;
	}
	
	/**
	 * Sets the series index.
	 *
	 * @param seriesIndex the new series index
	 */
	public void setSeriesIndex(String seriesIndex) {
		this.seriesIndex = seriesIndex;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
}
