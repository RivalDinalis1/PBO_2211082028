/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.controler;


import UTS_B.model.*;
import UTS_B.view.Formpegawai;

/**
 *
 * @author RIVAL DINALIS
 */
public class GajiControler {
    protected Formpegawai f;
    protected GajiDao dao;
    protected Gaji g;
    
    protected PegawaiDao pd;
    
    public GajiControler(Formpegawai f){
        this.f = f;
        dao = new GajiDaoImpl();
        pd = new PegawaiDaoImpl();
                
    }
    
    public void clear(){
        
    }
            
}
