package mx.ipn.escom.cdt.capacitacion.informacionbase.controller;

import java.util.List;

import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import mx.ipn.escom.cdt.capacitacion.informacionbase.bs.EmpresaBs;
import mx.ipn.escom.cdt.capacitacion.informacionbase.bs.EspecialistaEmpresaBs;
import mx.ipn.escom.cdt.capacitacion.informacionbase.model.Cuenta;
import mx.ipn.escom.cdt.capacitacion.informacionbase.model.Empresa;
import mx.ipn.escom.cdt.capacitacion.informacionbase.model.Especialista;
import mx.ipn.escom.cdt.capacitacion.informacionbase.model.EspecialistaEmpresa;
import mx.ipn.escom.cdt.util.bs.GenericSearchBs;

@Namespace("/informacion-base")
public class GestionarEmpresaCtrl extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7245219660559074060L;
	
	@Autowired
	private GenericSearchBs genericSearchBs;
	@Autowired
	private EmpresaBs empresaBs;
	private Integer idSel;
	private List<Empresa> listEmpresas;
	private Empresa model;
	private Cuenta cuenta;
	private Especialista especialista;
	private List<Especialista> listEspecialistas;
	private List<EspecialistaEmpresa> listEspecialistaEmpresas;
	private List<Integer> listIdPersonas;
	private Integer idPersonaSel;
	@Autowired
	private EspecialistaEmpresaBs especialistaEmpresaBs;

	public String index(){
		listEmpresas = genericSearchBs.findAll(Empresa.class);
		return "index";
	}

	public String editNew(){
		return "editNew";
	}
	
	public String edit(){
		return "edit";
	}
	
	public String addSpecialist(){
		return "addSpecialist";
	}
	
	public String buscarEspecialista(){
		System.err.println(especialista);
		listEspecialistas = genericSearchBs.findByExample(especialista);
		return "showSpecialists";
	}
	
	public String saveSpecialist(){
		System.err.println(model);
		System.err.println(idPersonaSel);
		especialistaEmpresaBs.guardar(model, idPersonaSel);
		return index();
	}
	
	public String show(){
		EspecialistaEmpresa example = new EspecialistaEmpresa();
		example.setIdEmpresa(model.getIdEmpresa());
		listEspecialistaEmpresas = genericSearchBs.findByExample(example);
		for (EspecialistaEmpresa empresa : listEspecialistaEmpresas) {
			System.err.println(empresa.getEspecialista());
		}
		return "show";
	}
	
	public String deleteConfirm(){
		return "deleteConfirm";
	}
	
	public String destroy(){
		empresaBs.delete(model);
		return index();
	}
	
	public String update(){
		empresaBs.update(model);
		return index();
	}
	
	public String create(){
		empresaBs.guardar(model, cuenta);
		return index();
	}

	public List<Empresa> getListEmpresas() {
		return listEmpresas;
	}

	public void setListEmpresas(List<Empresa> listEmpresas) {
		this.listEmpresas = listEmpresas;
	}

	public Empresa getModel() {
		if(model == null){
			this.model = new Empresa();
		}
		return model;
	}

	public void setModel(Empresa model) {
		this.model = model;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Integer getIdSel() {
		return idSel;
	}

	public void setIdSel(Integer idSel) {
		if(idSel != null){
			model = genericSearchBs.findById(Empresa.class, idSel);
		}
		this.idSel = idSel;
	}

	public Especialista getEspecialista() {
		return especialista;
	}

	public void setEspecialista(Especialista especialista) {
		this.especialista = especialista;
	}

	public List<Especialista> getListEspecialistas() {
		return listEspecialistas;
	}

	public void setListEspecialistas(List<Especialista> listEspecialistas) {
		this.listEspecialistas = listEspecialistas;
	}

	public List<Integer> getListIdPersonas() {
		return listIdPersonas;
	}

	public void setListIdPersonas(List<Integer> listIdPersonas) {
		this.listIdPersonas = listIdPersonas;
	}

	public Integer getIdPersonaSel() {
		return idPersonaSel;
	}

	public void setIdPersonaSel(Integer idPersonaSel) {
		this.idPersonaSel = idPersonaSel;
	}

	public List<EspecialistaEmpresa> getListEspecialistaEmpresas() {
		return listEspecialistaEmpresas;
	}

	public void setListEspecialistaEmpresas(List<EspecialistaEmpresa> listEspecialistaEmpresas) {
		this.listEspecialistaEmpresas = listEspecialistaEmpresas;
	}
}
