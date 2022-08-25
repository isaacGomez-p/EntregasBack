package com.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "IDATA")
public class IData implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer Id;

    @Column(name="CAMPANIA")
    private Integer campania;

    @Column(name="DESPACHO")
    private Integer despacho;

    @Column(name="MANIFIESTO")
    private Integer manifiesto;

    @Column(name="PEDIDO" , length = 20, unique = true)
    private String pedido;

    @Column(name="DESTINO_FINAL" , length = 200)
    private String destinoFinal;

    @Column(name="DEPTO" , length = 40)
    private String depto;

    @Column(name="CIUDAD" , length = 40)
    private String ciudad;

    @Column(name="DIRECCION" , length = 100)
    private String direccion;

    @Column(name="TEL" , length = 40)
    private String tel;

    @Column(name="ASIGNADO")
    private Integer asignado;

    @Column(name="CONDUCTOR" , length = 50)
    private String conductor;

    @Column(name="COND_CELULAR")
    private Integer cond_Celular;

    @Column(name="VEHI_PLACA" , length = 10)
    private String vehi_Placa;

    @Column(name="VEHI_TIPO" , length = 100)
    private String vehi_Tipo;

    @Column(name="VEHI_COLOR" , length = 20)
    private String vehi_Color;

    @Column(name="RELACION_ID")
    private Integer relacion_Id;

    @Column(name="RELACION_FEC")
    private String relacion_Fec;

    @Column(name="PRE_RUTA")
    private Integer preRuta;

    @Column(name="ESTADO")
    private Integer estado;

    @Column(name="CAUSAL_ID")
    private Integer causal_Id;

    @Column(name="ENTREGA_FEC" , length = 200)
    private String entrega_Fec;

    @Column(name="FOTO" , length = 10485760)
    private String foto;

    @Column(name="LAT")
    private Double lat;

    @Column(name="LNG")
    private Double lng;

    @Column(name="PREC")
    private Long prec;

    @Column(name="LAT_NOVEDAD")
    private Double latNovedad;

    @Column(name="LNG_NOVEDAD")
    private Double lngNovedad;

    @Column(name="FEC_SINCRONIZA")
    private Date fecSincroniza;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCampania() {
        return campania;
    }

    public void setCampania(Integer campania) {
        this.campania = campania;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    public Integer getManifiesto() {
        return manifiesto;
    }

    public void setManifiesto(Integer manifiesto) {
        this.manifiesto = manifiesto;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getDestinoFinal() {
        return destinoFinal;
    }

    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getAsignado() {
        return asignado;
    }

    public void setAsignado(Integer asignado) {
        this.asignado = asignado;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public Integer getCond_Celular() {
        return cond_Celular;
    }

    public void setCond_Celular(Integer cond_Celular) {
        this.cond_Celular = cond_Celular;
    }

    public String getVehi_Placa() {
        return vehi_Placa;
    }

    public void setVehi_Placa(String vehi_Placa) {
        this.vehi_Placa = vehi_Placa;
    }

    public String getVehi_Tipo() {
        return vehi_Tipo;
    }

    public void setVehi_Tipo(String vehi_Tipo) {
        this.vehi_Tipo = vehi_Tipo;
    }

    public String getVehi_Color() {
        return vehi_Color;
    }

    public void setVehi_Color(String vehi_Color) {
        this.vehi_Color = vehi_Color;
    }

    public Integer getRelacion_Id() {
        return relacion_Id;
    }

    public void setRelacion_Id(Integer relacion_Id) {
        this.relacion_Id = relacion_Id;
    }

    public String getRelacion_Fec() {
        return relacion_Fec;
    }

    public void setRelacion_Fec(String relacion_Fec) {
        this.relacion_Fec = relacion_Fec;
    }

    public Integer getPreRuta() {
        return preRuta;
    }

    public void setPreRuta(Integer preRuta) {
        this.preRuta = preRuta;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getCausal_Id() {
        return causal_Id;
    }

    public void setCausal_Id(Integer causal_Id) {
        this.causal_Id = causal_Id;
    }

    public String getEntrega_Fec() {
        return entrega_Fec;
    }

    public void setEntrega_Fec(String entrega_Fec) {
        this.entrega_Fec = entrega_Fec;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Long getPrec() {
        return prec;
    }

    public void setPrec(Long prec) {
        this.prec = prec;
    }

    public Double getLatNovedad() {
        return latNovedad;
    }

    public void setLatNovedad(Double latNovedad) {
        this.latNovedad = latNovedad;
    }

    public Double getLngNovedad() {
        return lngNovedad;
    }

    public void setLngNovedad(Double lngNovedad) {
        this.lngNovedad = lngNovedad;
    }

    public Date getFecSincroniza() {
        return fecSincroniza;
    }

    public void setFecSincroniza(Date fecSincroniza) {
        this.fecSincroniza = fecSincroniza;
    }
}
