package com.calculartipodecambio.tipocambio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class datosEntradaMonto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "vMonto Neg")
	private java.lang.Double vMontoNeg;
	@org.kie.api.definition.type.Label(value = "Resultado de tipo cambio cliente")
	private java.lang.Double vTipoCambio;

	public datosEntradaMonto() {
	}

	public java.lang.Double getvMontoNeg() {
		return this.vMontoNeg;
	}

	public void setvMontoNeg(java.lang.Double vMontoNeg) {
		this.vMontoNeg = vMontoNeg;
	}

	public java.lang.Double getvTipoCambio() {
		return this.vTipoCambio;
	}

	public void setvTipoCambio(java.lang.Double vTipoCambio) {
		this.vTipoCambio = vTipoCambio;
	}

	public datosEntradaMonto(java.lang.Double vMontoNeg,
			java.lang.Double vTipoCambio) {
		this.vMontoNeg = vMontoNeg;
		this.vTipoCambio = vTipoCambio;
	}

}