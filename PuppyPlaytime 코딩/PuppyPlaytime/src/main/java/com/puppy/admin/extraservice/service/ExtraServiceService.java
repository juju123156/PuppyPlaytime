package com.puppy.admin.extraservice.service;

import java.util.List;

import com.puppy.common.vo.ExtraServiceVO;

public interface ExtraServiceService {

	public List<ExtraServiceVO> extraServiceList(ExtraServiceVO param);

	public ExtraServiceVO extraServiceDetail(int parseInt);

	public int extraServiceAdd(ExtraServiceVO svo);
	
	public int extraServiceAdd2(ExtraServiceVO svo);

	public int extraServiceDisabled(ExtraServiceVO svo);

	public List<ExtraServiceVO> extraServiceDetail2(int parseInt);

}
