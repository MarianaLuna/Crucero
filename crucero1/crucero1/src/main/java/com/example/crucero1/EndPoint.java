package com.example.crucero1;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.example.crucero.*;


@Endpoint
public class EndPoint {

	@PayloadRoot(namespace ="http://www.example.org/Crucero",
			localPart = "RutaRequest")
	
	@ResponsePayload
	public RutaResponse getRuta(@RequestPayload RutaRequest peticion) {
		RutaResponse respuesta = new RutaResponse();
		respuesta.setResultadoRuta("la ruta es: " + peticion.getNombreRuta());
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Crucero",
			localPart = "ReservacionRequest")
	
	@ResponsePayload
	public ReservacionResponse getReservacion(@RequestPayload ReservacionRequest peticion) {
		ReservacionResponse respuesta = new ReservacionResponse();
		respuesta.setResultadoRutaSelect("Ruta seleccionada: " + peticion.getRutaSelect());
		respuesta.setResultadoNombreUsuario("Nombre de quien reserva: " + peticion.getNombreUsuario());
		respuesta.setResultadoFechaInicio("Fecha de origen: " + peticion.getFechaInicio());
		respuesta.setResultadoFechaFin("Fecha de destino: " + peticion.getFechaFin());
		respuesta.setResultadoCostoTotal("Costo total: "+peticion.getCostoTotal());
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Crucero",
			localPart = "VerReservacionRequest")
	
	@ResponsePayload
	public VerReservacionResponse getVerReservacion(@RequestPayload VerReservacionRequest peticion) {
		VerReservacionResponse respuesta = new VerReservacionResponse();
		respuesta.setResultadoNombreReservacion("Tu reservacion es: "+peticion.getNombreReservacion());
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Crucero",
			localPart = "EditarReservacionRequest")
	
	@ResponsePayload
	public EditarReservacionResponse getEditarReservacion (@RequestPayload EditarReservacionRequest peticion) {
		EditarReservacionResponse respuesta = new EditarReservacionResponse();
		respuesta.setResultadoRutaEditar("Nueva ruta: "+peticion.getRutaEditar());
		respuesta.setResultadoRechaInitEditar("Nueva fecha origen: "+peticion.getFechaInitEditar());
		respuesta.setResultadoFechaFinEditar("Nueva fecha destino: "+peticion.getFechaFinEditar());
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Crucero",
			localPart = "EliminarReservacionRequest")
	
	@ResponsePayload
	public EliminarReservacionResponse getEliminarReservacion (@RequestPayload EliminarReservacionRequest peticion) {
		EliminarReservacionResponse respuesta = new EliminarReservacionResponse();
		respuesta.setResultadoReservacionEliminar("Reservacion eliminada: "+peticion.getReservacionEliminar());
		return respuesta;
	}
	
	
}
