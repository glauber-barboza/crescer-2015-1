package filmator.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filmator.dao.UserDao;
import filmator.model.Genero;
import filmator.model.Users;

@Controller
public class UserController {

	@Inject
	UserDao userdao;

	@RequestMapping(value = "/logar", method = RequestMethod.POST)
	public String home(Users user, Model model, HttpSession session) {
		List<Users> userRecebido = null;
		if(!user.getLogin().isEmpty() && !user.getSenha().isEmpty()){

			userRecebido= userdao.verificaUsuario(user.getLogin(),
					user.getSenha());
		}
		

		if (userRecebido.get(0) != null && userRecebido.size() > 0) {
			model.addAttribute("loginNome", userRecebido.get(0).getLogin());
			session.setAttribute("usuarioLogado", userRecebido.get(0));
			model.addAttribute("nomeUsuario", userRecebido.get(0).getLogin());
			return "redirect:/Home";
		} else {
			return "redirect:/Home";
		}
	}
	
	@RequestMapping(value = "/CadUser", method = RequestMethod.GET)
	public String CadUser(Model model, HttpSession session) {
		Users usuario = (Users) session.getAttribute("usuarioLogado");
		model.addAttribute("usuarioNaoEstaLogado", usuario == null ? true : false);
		model.addAttribute("usuarioEstaLogado", usuario != null ? true : false);
		model.addAttribute("nomeUsuario",usuario == null ? "" : usuario.getLogin());
		
		System.out.println("teste");
		return "CadUser";
		}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String Cadastrar(Users user, Model model, HttpSession session) {

		System.out.println(user.getLogin());
		System.out.println(user.getSenha());
		System.out.println(user.getSenhaConfirma());
		if(!user.getLogin().isEmpty() && !user.getSenha().isEmpty() && user.getSenha().equals(user.getSenhaConfirma())){
			System.out.println("Foi");
			userdao.inserir(user);
			return "redirect:/Home";
		}else {
			
			return "redirect:/CadUser";
		}
	}
}
