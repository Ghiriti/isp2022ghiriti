/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author mihai.hulea
 */
public class Portofolio extends AbstractTableModel{
    
    
    private ArrayList<UserStock> stocks = new ArrayList<>();
    
    @Getter @Setter
    private BigDecimal funds;
    
    private StockMarketQueryService marketService;

    public Portofolio(BigDecimal funds, StockMarketQueryService marketService) {
        this.funds = funds;
        this.marketService = marketService;
    }

    void buy(String symbol, int q) {
        System.out.println("BUY "+q+" "+symbol);
        BigDecimal price = marketService.getPrice(symbol);
        if(price.doubleValue()*q<=funds.doubleValue()){
            funds = funds.subtract(price.multiply(new BigDecimal(q)));
            System.out.println("New funds: "+funds.toPlainString());
            addOrUpdate(symbol, q);
        }
            
        
    }
    
    private void addOrUpdate(String symbol, int q){
        for(UserStock s: stocks){
         if(s.getSymbol().equals(symbol)){
             s.setQuantity(s.getQuantity()+q);
             return;
         }
        }//.for
        UserStock us = new UserStock(q, symbol);
        stocks.add(us);
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
