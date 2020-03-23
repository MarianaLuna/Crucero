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
 *         &lt;element name="reservacionEliminar" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reservacionEliminar"
})
@XmlRootElement(name = "EliminarReservacionRequest")
public class EliminarReservacionRequest {

    @XmlElement(required = true)
    protected String reservacionEliminar;

    /**
     * Obtiene el valor de la propiedad reservacionEliminar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservacionEliminar() {
        return reservacionEliminar;
    }

    /**
     * Define el valor de la propiedad reservacionEliminar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservacionEliminar(String value) {
        this.reservacionEliminar = value;
    }

}
