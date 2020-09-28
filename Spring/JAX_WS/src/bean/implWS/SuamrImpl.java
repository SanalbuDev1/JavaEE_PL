package bean.implWS;

import javax.ejb.Stateless;
import javax.jws.WebService;

import bean.interfaces.ServicioSumarWS;

@Stateless
@WebService(endpointInterface = "bean.interfaces.ServicioSumarWS")
public class SuamrImpl implements ServicioSumarWS {

	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
