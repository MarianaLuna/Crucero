//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.03.23 a las 01:27:31 PM CST 
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
 *         &lt;element name="rutaEditar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInitEditar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaFinEditar" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "rutaEditar",
    "fechaInitEditar",
    "fechaFinEditar"
})
@XmlRootElement(name = "EditarReservacionRequest")
public class EditarReservacionRequest {

    @XmlElement(required = true)
    protected String rutaEditar;
    @XmlElement(required = true)
    protected String fechaInitEditar;
    @XmlElement(required = true)
    protected String fechaFinEditar;

    /**
     * Obtiene el valor de la propiedad rutaEditar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaEditar() {
        return rutaEditar;
    }

    /**
     * Define el valor de la propiedad rutaEditar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaEditar(String value) {
        this.rutaEditar = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInitEditar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInitEditar() {
        return fechaInitEditar;
    }

    /**
     * Define el valor de la propiedad fechaInitEditar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInitEditar(String value) {
        this.fechaInitEditar = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinEditar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinEditar() {
        return fechaFinEditar;
    }

    /**
     * Define el valor de la propiedad fechaFinEditar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinEditar(String value) {
        this.fechaFinEditar = value;
    }

}
