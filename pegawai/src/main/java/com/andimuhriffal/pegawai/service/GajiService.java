/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.pegawai.service;

import com.andimuhriffal.pegawai.model.GajiModel;
import java.util.Collection;

/**
 *
 * @author Acer
 */
public interface GajiService {
    public void addGaji (GajiModel gaji);
    public Collection<GajiModel> getGaji();
    public GajiModel getGajiBersih(String id);
    public GajiModel editGajiBersih(GajiModel gaji);
    public void deleteGajiBersih(String id);
    public boolean gajiExist(String id);

    public GajiModel findGajiById(Long gajiId);

    public GajiModel saveGaji(GajiModel gaji);
    
}
