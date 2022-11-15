/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.pegawai.repository;

import com.andimuhriffal.pegawai.model.GajiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author Acer
 */
@Repository
public interface GajiRepository extends JpaRepository<GajiModel, Long> {

    public GajiModel findByGajiId(Long gajiId);
    
}
