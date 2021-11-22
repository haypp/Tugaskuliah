/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grosirin;

/**
 *
 * @author mainw
 */
public class ProductList {
    private String namabarang;
    private String jumlah;
    private String total;
    
    
    public ProductList(String namabarang, String jumlah, String total)
    {
        this.namabarang = namabarang;
        this.jumlah = jumlah;
        this.total = total;
        
    }
    
    public String getNamaBarang()
    {
        return namabarang;
    }
    
    public void setNamaBarang(String namabarang)
    {
        this.namabarang = namabarang;
    }
    
    public String getJumlah()
    {
        return jumlah;
    }
    
    public void setJumlah(String jumlah)
    {
        this.jumlah = jumlah;
    }
    
    public String getTotal()
    {
        return total;
    }
    
    public void setTotal(String total)
    {
        this.total = total;
    }
}
