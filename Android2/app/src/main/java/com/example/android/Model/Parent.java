package com.example.android.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
//Уровень:родитель
public class Parent{

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("per_page")
    @Expose
    private Integer per_page;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("total_page")
    @Expose
    private Integer total_page;
    @SerializedName("data")
    @Expose
    private List<Child> data = null;

    /**
     * Возврат полученных данных
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPerPage() {
        return per_page;
    }

    public void setPerPage(Integer perPage) {
        this.per_page = perPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return total_page;
    }

    public void setTotalPages(Integer totalPages) {
        this.total_page = totalPages;
    }

    public List<Child> getData() {
        return data;
    }

    public void setData(List<Child> data) {
        this.data = data;
    }
}