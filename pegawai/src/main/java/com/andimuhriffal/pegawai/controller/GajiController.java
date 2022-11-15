/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.pegawai.controller;

import com.andimuhriffal.pegawai.model.GajiModel;
import com.andimuhriffal.pegawai.service.GajiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Acer
 */
@RestController
@RequestMapping("/gaji")
public class GajiController {
    @Autowired
    private GajiService gajiService;
    
    @PostMapping("/")
    public GajiModel saveGaji(@RequestBody GajiModel gaji){
        return gajiService.saveGaji(gaji);
    }
    
    @GetMapping("/{id}")
    public GajiModel findGajiById(@PathVariable("id") Long gajiId){
        return gajiService.findGajiById(gajiId);
    }
}
