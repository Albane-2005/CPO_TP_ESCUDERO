/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_escudero;

/**
 *
 * @author alban
 */
public class Convertisseur {
    private int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public float CelciusVersKelvin(float tCelcius) {
        nbConversions++;
        return tCelcius + 273.15f;
    }

    public float KelvinVersCelcius(float tKelvin) {
        nbConversions++;
        return tKelvin - 273.15f;
    }

    public float FarenheitVersCelcius(float tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32f) / 1.8f;
    }

    public float CelciusVersFarenheit(float tCelcius) {
        nbConversions++;
        return tCelcius * 1.8f + 32f;
    }

    public float FarenheitVersKelvin(float tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32f) / 1.8f + 273.15f;
    }

    public float KelvinVersFarenheit(float tKelvin) {
        nbConversions++;
        return (tKelvin - 273.15f) * 1.8f + 32f;
    }

    @Override
    public String toString() {
        return "nb de conversions : " + nbConversions;
    }

}
