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
 *         &lt;element name="resultadoRutaEditar" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="resultadoRechaInitEditar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultadoFechaFinEditar" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "resultadoRutaEditar",
    "resultadoRechaInitEditar",
    "resultadoFechaFinEditar"
})
@XmlRootElement(name = "EditarReservacionResponse")
public class EditarReservacionResponse {

    @XmlElement(required = true)
    protected Object resultadoRutaEditar;
    @XmlElement(required = true)
    protected String resultadoRechaInitEditar;
    @XmlElement(required = true)
    protected String resultadoFechaFinEditar;

    /**
     * Obtiene el valor de la propiedad resultadoRutaEditar.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResultadoRutaEditar() {
        return resultadoRutaEditar;
    }

    /**
     * Define el valor de la propiedad resultadoRutaEditar.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResultadoRutaEditar(Object value) {
        this.resultadoRutaEditar = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoRechaInitEditar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoRechaInitEditar() {
        return resultadoRechaInitEditar;
    }

    /**
     * Define el valor de la propiedad resultadoRechaInitEditar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoRechaInitEditar(String value) {
        this.resultadoRechaInitEditar = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoFechaFinEditar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoFechaFinEditar() {
        return resultadoFechaFinEditar;
    }

    /**
     * Define el valor de la propiedad resultadoFechaFinEditar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoFechaFinEditar(String value) {
        this.resultadoFechaFinEditar = value;
    }

}
