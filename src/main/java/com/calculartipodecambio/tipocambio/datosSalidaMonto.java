package com.calculartipodecambio.tipocambio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class datosSalidaMonto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "vSpread Monto Neg")
	private java.lang.Double vSpreadMontoNeg;
	@org.kie.api.definition.type.Label(value = "Resultado tipo cambio cliente")
	private java.lang.Double vTipoCambioCliente;

	public datosSalidaMonto() {
	}

	public java.lang.Double getvSpreadMontoNeg() {
		return this.vSpreadMontoNeg;
	}

	public void setvSpreadMontoNeg(java.lang.Double vSpreadMontoNeg) {
		this.vSpreadMontoNeg = vSpreadMontoNeg;
	}

	public java.lang.Double getvTipoCambioCliente() {
		return this.vTipoCambioCliente;
	}

	public void setvTipoCambioCliente(java.lang.Double vTipoCambioCliente) {
		this.vTipoCambioCliente = vTipoCambioCliente;
	}

	public datosSalidaMonto(java.lang.Double vSpreadMontoNeg,
			java.lang.Double vTipoCambioCliente) {
		this.vSpreadMontoNeg = vSpreadMontoNeg;
		this.vTipoCambioCliente = vTipoCambioCliente;
	}

}