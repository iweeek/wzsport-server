/**
 * 
 */
package com.wzsport.service;

import java.util.List;

import com.wzsport.model.RunningActivityData;

/**
 * @author wenky
 *
 */
public interface ExportService {

	/**
	 * @param lists
	 * @return
	 */
	public String createExcelByRunningActivityViews(List<RunningActivityData> lists);

}
