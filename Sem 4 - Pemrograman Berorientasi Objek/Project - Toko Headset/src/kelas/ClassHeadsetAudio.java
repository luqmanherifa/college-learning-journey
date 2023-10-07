/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

import kelas.ClassAlatAudio;

/**
 *
 * @author Kyrin
 */
public class ClassHeadsetAudio extends ClassAlatAudio {
    protected String kodeHS;
    protected String earcupHS;
    protected String headbandHS;
    
    public String getKodeHS() {
        return kodeHS;
    }

    public void setKodeHS(String kodeHS) {
        this.kodeHS = kodeHS;
    }

    public String getEarcupHS() {
        return earcupHS;
    }

    public void setEarcupHS(String earcupHS) {
        this.earcupHS = earcupHS;
    }

    public String getHeadbandHS() {
        return headbandHS;
    }

    public void setHeadbandHS(String headbandHS) {
        this.headbandHS = headbandHS;
    }
}