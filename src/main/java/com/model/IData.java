package com.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "IDATA")
public class IData implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer Id;

    @Column(name="CAMPANIA")
    private Integer Campania;

    @Column(name="DESPACHO")
    private Integer Despacho;

    @Column(name="MANIFIESTO")
    private Integer Manifiesto;

    @Column(name="PEDIDO" , length = 20, unique = true)
    private String Pedido;

    @Column(name="DESTINO_FINAL" , length = 200)
    private String DestinoFinal;

    @Column(name="DEPTO" , length = 40)
    private String Depto;

    @Column(name="CIUDAD" , length = 40)
    private String Ciudad;

    @Column(name="DIRECCION" , length = 100)
    private String Direccion;

    @Column(name="TEL" , length = 40)
    private String Tel;

    @Column(name="ASIGNADO")
    private Integer Asignado;

    @Column(name="CONDUCTOR" , length = 50)
    private String Conductor;

    @Column(name="COND_CELULAR")
    private Integer Cond_Celular;

    @Column(name="VEHI_PLACA" , length = 10)
    private String Vehi_Placa;

    @Column(name="VEHI_TIPO" , length = 100)
    private String Vehi_Tipo;

    @Column(name="VEHI_COLOR" , length = 20)
    private String Vehi_Color;

    @Column(name="RELACION_ID")
    private Integer Relacion_Id;

    @Column(name="RELACION_FEC")
    private String Relacion_Fec;

    @Column(name="PRE_RUTA")
    private Integer PreRuta;

    @Column(name="ESTADO")
    private Integer Estado;

    @Column(name="CAUSAL_ID")
    private Integer Causal_Id;

    @Column(name="ENTREGA_FEC" , length = 200)
    private String Entrega_Fec;

    @Column(name="FOTO" , length = 10485760)
    private String Foto;

    @Column(name="LAT")
    private Double Lat;

    @Column(name="LNG")
    private Double Lng;

    @Column(name="PREC")
    private Long Prec;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCampania() {
        return Campania;
    }

    public void setCampania(Integer campania) {
        Campania = campania;
    }

    public Integer getDespacho() {
        return Despacho;
    }

    public void setDespacho(Integer despacho) {
        Despacho = despacho;
    }

    public Integer getManifiesto() {
        return Manifiesto;
    }

    public void setManifiesto(Integer manifiesto) {
        Manifiesto = manifiesto;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String pedido) {
        Pedido = pedido;
    }

    public String getDestinoFinal() {
        return DestinoFinal;
    }

    public void setDestinoFinal(String destinoFinal) {
        DestinoFinal = destinoFinal;
    }

    public String getDepto() {
        return Depto;
    }

    public void setDepto(String depto) {
        Depto = depto;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public Integer getAsignado() {
        return Asignado;
    }

    public void setAsignado(Integer asignado) {
        Asignado = asignado;
    }

    public String getConductor() {
        return Conductor;
    }

    public void setConductor(String conductor) {
        Conductor = conductor;
    }

    public Integer getCond_Celular() {
        return Cond_Celular;
    }

    public void setCond_Celular(Integer cond_Celular) {
        Cond_Celular = cond_Celular;
    }

    public String getVehi_Placa() {
        return Vehi_Placa;
    }

    public void setVehi_Placa(String vehi_Placa) {
        Vehi_Placa = vehi_Placa;
    }

    public String getVehi_Tipo() {
        return Vehi_Tipo;
    }

    public void setVehi_Tipo(String vehi_Tipo) {
        Vehi_Tipo = vehi_Tipo;
    }

    public String getVehi_Color() {
        return Vehi_Color;
    }

    public void setVehi_Color(String vehi_Color) {
        Vehi_Color = vehi_Color;
    }

    public Integer getRelacion_Id() {
        return Relacion_Id;
    }

    public void setRelacion_Id(Integer relacion_Id) {
        Relacion_Id = relacion_Id;
    }

    public String getRelacion_Fec() {
        return Relacion_Fec;
    }

    public void setRelacion_Fec(String relacion_Fec) {
        Relacion_Fec = relacion_Fec;
    }

    public Integer getPreRuta() {
        return PreRuta;
    }

    public void setPreRuta(Integer preRuta) {
        PreRuta = preRuta;
    }

    public Integer getEstado() {
        return Estado;
    }

    public void setEstado(Integer estado) {
        Estado = estado;
    }

    public Integer getCausal_Id() {
        return Causal_Id;
    }

    public void setCausal_Id(Integer causal_Id) {
        Causal_Id = causal_Id;
    }

    public String getEntrega_Fec() {
        return Entrega_Fec;
    }

    public void setEntrega_Fec(String entrega_Fec) {
        Entrega_Fec = entrega_Fec;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLng() {
        return Lng;
    }

    public void setLng(Double lng) {
        Lng = lng;
    }

    public Long getPrec() {
        return Prec;
    }

    public void setPrec(Long prec) {
        Prec = prec;
    }
}
