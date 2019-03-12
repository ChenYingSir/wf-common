package com.zb.mapper;
import com.zb.pojo.WfOrderItem;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WfOrderItemMapper {
	//陈营
    //test
	public WfOrderItem getWfOrderItemById(@Param(value = "id") Long id)throws Exception;

	public List<WfOrderItem> getWfOrderItemListByMap(Map<String,Object> param)throws Exception;

	public Integer getWfOrderItemCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertWfOrderItem(WfOrderItem wfOrderItem)throws Exception;

	public Integer updateWfOrderItem(WfOrderItem wfOrderItem)throws Exception;

	public Integer deleteWfOrderItemById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteWfOrderItem(Map<String,List<String>> params);

}
