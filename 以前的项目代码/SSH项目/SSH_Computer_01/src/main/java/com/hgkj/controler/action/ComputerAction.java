package com.hgkj.controler.action;

import com.hgkj.model.entity.Computer;
import com.hgkj.model.service.ComputerService;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Namespace("/")
//@ParentPackage("struts-default")
@ParentPackage("json-default")
public class ComputerAction {
    @Autowired
    private ComputerService computerService;
    private Computer computer;
   private int computerId;
/*    private List<Computer> computerList;
    private String message;

    public List <Computer> getComputerList() {
        return computerList;
    }

    public void setComputerList(List <Computer> computerList) {
        this.computerList = computerList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }*/

    public Computer getComputer() {
        return computer;
    }


    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) { this.computerId = computerId; }

    public void setComputer(Computer computer) {this.computer = computer; }

    public void setComputerService(ComputerService computerService) {
        this.computerService = computerService;
    }

        @Action(value = "allComputer", results = @Result(name = "all", type = "redirect", location = "/show.jsp"))
    //@Action(value = "allComputer", results = @Result(name = "all", type = "json", params = {"root","computerList"}))
    public String allComputer() {
        List<Computer> computerList = computerService.allComputerService();
        ActionContext.getContext().getSession().put("computerList", computerList);
        return "all";
    }
    @Action(value = "addComputer", results = {@Result(name = "add", type = "redirectAction", location = "allComputer")})
  //  @Action(value = "addComputer", results = {@Result(name = "add", type = "redirect", location = "show.jsp")})
    public String addComputer() {
        computerService.insertComputerService(computer);
        return "add";
    }
   // @Action(value = "deleteComputer", results = {@Result(name = "del", type = "json",params = {"root","message"})})
    @Action(value = "deleteComputer", results = {@Result(name = "del", type = "redirectAction", location = "allComputer")})
    public String deleteComputer() {
        computerService.deleteComputerService(computerId);
        return "del";
      /*  if(computerService.deleteComputerService(computer.getComputerId())){
            message="ok";
        }else{
            message="nook";
        }
        return "del";*/
    }
    @Action(value = "findComputer",results = {@Result(name = "find",location = "/update.jsp")})
    //@Action(value = "findComputer",results = {@Result(name = "find",type = "redirect",location = "/update.jsp")})
    public String find(){
       // Computer computer=computerService.computerByIdService(getComputer().getComputerId());
        Computer computer=computerService.computerByIdService(computerId);
        ActionContext.getContext().getSession().put("computer",computer);
        return "find";
    }
    @Action(value = "updateComputer",results = @Result(name = "update",type = "redirectAction",location = "allComputer"))
   // @Action(value = "updateComputer",results = @Result(name = "update",type = "redirect",location = "/show.jsp"))
    public String updateComputer(){
      computerService.updateComputerService(computer);
        return "update";
    }
}
