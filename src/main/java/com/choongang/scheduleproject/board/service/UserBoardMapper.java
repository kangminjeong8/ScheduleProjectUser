package com.choongang.scheduleproject.board.service;

import java.util.ArrayList;
import java.util.Map;

import com.choongang.scheduleproject.command.FileVO;
import com.choongang.scheduleproject.command.ProjectVO;
import com.choongang.scheduleproject.command.UserBoardVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBoardMapper {
	
	/***
	 * 
	 * @param map
	 * @return ArrayList
	 */
	public ArrayList<UserBoardVO> getList(Map<String, Object> map); //페이지
	
	
	/***
	 * 
	 * @param map
	 * @return int
	 */
	public int getCount(Map<String, Object> map); //검색 결과 건 수
	
	/***
	 * 
	 * @param map
	 * @return int
	 */
	public int getContent(Map<String, Object> map); //글 등록
	
	
	/***
	 * 
	 * @param pj_num
	 * @return ArrayList
	 */
	public ArrayList<ProjectVO> getObserver(int pj_num); //옵저버
	
	/***
	 * 
	 * @param vo
	 * @return int
	 */
	public int fileUploadList(FileVO vo);
	
}
