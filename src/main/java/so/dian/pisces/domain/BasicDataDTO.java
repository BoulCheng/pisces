package so.dian.pisces.domain;

/**
 * @author yuanming
 * Created on 2019/10/25
 * Description
 */
public class BasicDataDTO {

    private String orderDate;

    private Integer pageNum;

    private Integer pageSize;

    private Integer pageCount;

    private Integer offset;

    public BasicDataDTO(String orderDate) {
        this(orderDate, 5000);
    }
    public BasicDataDTO(String orderDate, Integer pageSize) {
        this.orderDate = orderDate;
        this.pageNum = 1;
        this.pageSize = pageSize;
        this.offset = this.calculateOffset();
    }

    private Integer calculateOffset() {
        return (this.pageNum - 1) * this.pageSize;
    }

    public Integer nextPage() {
        this.pageNum++;
        this.offset = calculateOffset();
        return this.pageNum;
    }

    public void setPageCount(Long total) {
        Integer pageCount = (int) (total / this.pageSize);
        if (total % this.pageSize > 0) {
            pageCount++;
        }
        this.pageCount = pageCount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public Integer getOffset() {
        return offset;
    }
}
