//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.03 a las 11:01:42 PM CST 
//


package org.example.crucero;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoRutaSelect" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultadoNombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultadoFechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultadoFechaFin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultadoCostoTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultadoRutaSelect",
    "resultadoNombreUsuario",
    "resultadoFechaInicio",
    "resultadoFechaFin",
    "resultadoCostoTotal"
})
@XmlRootElement(name = "ReservacionResponse")
public class ReservacionResponse {

    @XmlElement(required = true)
    protected String resultadoRutaSelect;
    @XmlElement(required = true)
    protected String resultadoNombreUsuario;
    @XmlElement(required = true)
    protected String resultadoFechaInicio;
    @XmlElement(required = true)
    protected String resultadoFechaFin;
    @XmlElement(required = true)
    protected String resultadoCostoTotal;

    /**
     * Obtiene el valor de la propiedad resultadoRutaSelect.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoRutaSelect() {
        return resultadoRutaSelect;
    }

    /**
     * Define el valor de la propiedad resultadoRutaSelect.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoRutaSelect(String value) {
        this.resultadoRutaSelect = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoNombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoNombreUsuario() {
        return resultadoNombreUsuario;
    }

    /**
     * Define el valor de la propiedad resultadoNombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoNombreUsuario(String value) {
        this.resultadoNombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoFechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoFechaInicio() {
        return resultadoFechaInicio;
    }

    /**
     * Define el valor de la propiedad resultadoFechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoFechaInicio(String value) {
        this.resultadoFechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoFechaFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoFechaFin() {
        return resultadoFechaFin;
    }

    /**
     * Define el valor de la propiedad resultadoFechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoFechaFin(String value) {
        this.resultadoFechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoCostoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoCostoTotal() {
        return resultadoCostoTotal;
    }

    /**
     * Define el valor de la propiedad resultadoCostoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoCostoTotal(String value) {
        this.resultadoCostoTotal = value;
    }

}
