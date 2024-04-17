package com.zxdc.model.entity;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 分页的图书集合
	 */
	private List<T>data;
	/**
	 * 当前的页码
	 * 		用户传入
	 */
	private int pageNumber;
	/**
	 * 总页码
	 * 	可以计算得到
	 */
	private int totalPage;
	/**
	 * 查询分页数据的起始索引
	 * 		可以计算得到
	 */
	private int index;
	/**
	 * 每页显示的记录条数
	 * 		设置好的
	 */
	private int size;
	/**
	 * 图书记录总条数
	 * 		查询表得到
	 */
	private int totalCount;
	/**
	 * 访问当前分页的路径
	 */
	private String path;
	public Page(List<T> data, int pageNumber, int totalPage, int index, int size, int totalCount) {
		super();
		this.data = data;
		this.pageNumber = pageNumber;
		this.totalPage = totalPage;
		this.index = index;
		this.size = size;
		this.totalCount = totalCount;
	}
	public Page() {
		super();
	}
	@Override
	public String toString() {
		return "Page [data=" + data + ", pageNumber=" + pageNumber + ", totalPage=" + getTotalPage() + ", index=" + getIndex()
				+ ", size=" + size + ", totalCount=" + totalCount + "]";
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
	public int getPageNumber() {
		if(pageNumber<1){
			//如果当前页面小于1，返回1
			pageNumber = 1;
		}else if(pageNumber>getTotalPage()){
			//如果大于最大页，返回最大页
			pageNumber = getTotalPage();
		}
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	/**
	 * 计算得到，不需要设置方法
	 * 		根据 totalCount和size计算得到
	 * totalCount  size	totalPage
	 *  10			2		5   totalCount/size
	 *  			3		4   totalCount/size+1
	 *  			11		1	totalCount/size+1
	 *  totalCount%size如果能够被整除 总页数就是totalCount/size
	 *  	如果不能被整除totalCount/size+1
	 *  page类中比较多的属性都是计算得到，我们在方法中使用属性时需要调用get方法来获取值
	 * @return
	 */
	public int getTotalPage() {
		if(getTotalCount()%getSize()==0){
			//整除
			return getTotalCount()/getSize();
		}else{
			return getTotalCount()/getSize()+1;
		}
	}
	/*public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}*/
	/**
	 * 计算得到
	 * 		pageNumber ， size
	 * @return
	 */
	public int getIndex() {
		return getSize()*(getPageNumber()-1);
	}
	/*public void setIndex(int index) {
		this.index = index;
	}*/
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
}
