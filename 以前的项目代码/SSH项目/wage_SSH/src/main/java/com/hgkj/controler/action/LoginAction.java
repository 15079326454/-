package com.hgkj.controler.action;

import com.hgkj.model.entity.*;
import com.hgkj.model.service.*;
import com.opensymphony.xwork2.ActionContext;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@Namespace("/")
@ParentPackage("struts-default")
public class LoginAction {
    private Staffinfo staffinfo;
    private int staffId;


    private String staffPwd1;
    private String staffPwd2;
    private String staffPwd3;
    private String staffPwd;
    @Autowired
    private LoginService loginService;
    @Autowired
    private StaffinfoService staffinfoService;
    @Autowired
    private ShopService shopService;
    private Shop shop;
    private int shopId;

    /*等级表的增删改查*/
    @Autowired
    private LevelService levelService;
    private Level level;
    private int levelId;
    /*部门表的增删改查*/
    @Autowired
    private DepartmentService departmentService;
    private Department department;
    private int depId;
    /*奖金表的增删改查*/
    @Autowired
    private RewardService rewardService;
    private Reward reward;
    private int rewId;
    /*补贴表是增删改查*/
    @Autowired
    private SubsidyService subsidyService;
    private Subsidy subsidy;
    private int subsidyId;
    /*补贴记录表*/
    @Autowired
    private SubsidyLogService subsidyLogService;
    private SubsidyLog subsidyLog;
    private int sublogId;

    /*考勤表的增删改查*/
    @Autowired
    private AttendanceService attendanceService;
    private Attendance attendance;
    private int attId;

    /*角色表的增删改*/
    @Autowired
    private RolesService rolesService;
    private Roles roles;
    private int rolesId;
/*考情记录表的增删改查*/
    @Autowired
    private AttendanceLogService attendanceLogService;
    private AttendanceLog attendanceLog;
    private int attlogId;
/*奖金记录增删改查*/
@Autowired
private RewardLogService rewardLogService;
private RewardLog rewardLog;
private int rewlogId;




    /*-------------------以下为系统管理的操作以及登录管理---------------------------------------------------------------------------------------------*/
    @Action(value = "LoginAction", results = {@Result(name = "login", type = "redirect", location = "main.jsp"), @Result(name = "error", type = "redirect", location = "login.jsp")})
   public String login() {
        Staffinfo staffinfo1 = loginService.LoginService(staffinfo);
        try {
            System.out.println(staffinfo1);
        } catch (Exception e) {
            System.out.println("数据库中没有");
            e.printStackTrace();
        }
        if (staffinfo1 == null) {
            return "error";
        } else {
            ActionContext.getContext().getSession().put("staffinfo1", staffinfo1);
        }
        return "login";
    }

    /* public String stafffLogin() {
         Staffinfo staffinfo1 = loginService.LoginService(staffinfo);
         if (staffinfo1.getStaffId() > 0) {
             ActionContext.getContext().getSession().put("staffinfo1", staffinfo1);
             return "login";
         }else {
             return "error";
         }

     }
 */
    @Action(value = "panDuanPwd", results = {@Result(name = "success", type = "redirect", location = "welcome/welcome.jsp"), @Result(name = "different", type = "redirect", location = "html/resetpass.jsp"), @Result(name = "false", type = "redirect", location = "html/resetpass.jsp")})
    public String panDuanPwd() {
        String result = null;
        if (staffPwd1.equals(staffPwd2)) {
            if (staffinfo.getStaffPwd().equals(staffPwd3)) {
                loginService.updateService(staffinfo);
                result = "success";
            } else {

                System.out.println("密码不一致");
                result = "different";
            }
        } else {
            ActionContext.getContext().getSession().put("msg", "原密码不正确");
            System.out.println("原密码不正确");
            result = "false";
        }
        return result;
    }
    /*===========================================以下为员工信息表的增删改查=======================================================================================================*/

    @Action(value = "allStaffAction", results = {@Result(name = "all", type = "redirect", location = "html/empList.jsp")})
    public String allStaff() {
        List <Staffinfo> staffinfoList = staffinfoService.allStaffService(staffinfo);
        ActionContext.getContext().getSession().put("staffinfoList", staffinfoList);
        return "all";
    }

    @Action(value = "addStaffsAction", results = {@Result(name = "addStaffs", type = "redirectAction", location = "allStaffAction")})
    public String addStaffs() {
        staffinfoService.addStaffService(staffinfo);
        return "addStaffs";
    }

    @Action(value = "find", results = {@Result(name = "success", type = "redirect", location = "html/resetpass.jsp")})
    public String find() {
        Staffinfo staffinfo = staffinfoService.staffByIdService(staffId);
        ActionContext.getContext().getSession().put("staffinfo", staffinfo);
        return "success";
    }

    @Action(value = "delStaffAction", results = {@Result(name = "deletStaff", type = "redirectAction", location = "allStaffAction")})
    public String deletStaff() {
        staffinfoService.deletStaffService(staffId);
        return "deletStaff";
    }

    @Action(value = "updStaffAction", results = {@Result(name = "updateStaff", type = "redirectAction", location = "allStaffAction")})
    public String updateStaff() {
        staffinfoService.updateStaffService(staffinfo);
        return "updateStaff";
    }

    @Action(value = "getByIdAction", results = {@Result(name = "byId", type = "redirect", location = "html/empEdit.jsp")})
    public String getByIdYg() {
        Staffinfo staffinfo = staffinfoService.staffByIdService(staffId);
        ActionContext.getContext().getSession().put("staffinfo", staffinfo);
        /*等级表*/
        List <Level> levelList = levelService.allLevelService(level);
        ActionContext.getContext().getSession().put("levelList", levelList);
        /*角色表*/
        List <Roles> rolesList = rolesService.allRolesService(roles);
        ActionContext.getContext().getSession().put("rolesList", rolesList);
        /*商店表*/
        List <Shop> shopList = shopService.allShopService(shop);
        ActionContext.getContext().getSession().put("shopList", shopList);
        /*部门表*/
        List <Department> departmentList = departmentService.allDeptService(department);
        ActionContext.getContext().getSession().put("departmentList", departmentList);
        return "byId";
    }

    /*查询所员工信息表中的等级表、角色表、商店表、部门表*/
    @Action(value = "allAction", results = {@Result(name = "all", type = "redirect", location = "html/empAdd.jsp")})
    public String all() {
        /*等级表*/
        List <Level> levelList = levelService.allLevelService(level);
        ActionContext.getContext().getSession().put("levelList", levelList);
        /*角色表*/
        List <Roles> rolesList = rolesService.allRolesService(roles);
        ActionContext.getContext().getSession().put("rolesList", rolesList);
        /*商店表*/
        List <Shop> shopList = shopService.allShopService(shop);
        ActionContext.getContext().getSession().put("shopList", shopList);
        /*部门表*/
        List <Department> departmentList = departmentService.allDeptService(department);
        ActionContext.getContext().getSession().put("departmentList", departmentList);
        return "all";
    }

    /*==============================================奖金表的增删改查==================================================================*/
    @Action(value = "allRewardAction", results = {@Result(name = "allRew", type = "redirect", location = "html/bonuslist.jsp")})
    public String allReward() {
        List <Reward> rewardList = rewardService.allRewardService(reward);
        ActionContext.getContext().getSession().put("rewardList", rewardList);
        return "allRew";
    }

    @Action(value = "addRewardAction", results = {@Result(name = "addRew", type = "redirectAction", location = "allRewardAction")})
    public String addReward() {
        rewardService.addRewardService(reward);
        return "addRew";
    }

    @Action(value = "allRAction", results = {@Result(name = "all", type = "redirect", location = "html/bonusAdd.jsp")})
    public String allR() {
        List <Reward> rewardList = rewardService.allRewardService(reward);
        ActionContext.getContext().getSession().put("rewardList", rewardList);
        return "all";
    }

    @Action(value = "deletRewardAction", results = {@Result(name = "delRew", type = "redirectAction", location = "allRewardAction")})
    public String deletReward() {
        rewardService.deletRewardService(rewId);
        return "delRew";
    }

    @Action(value = "findRewardAction", results = {@Result(name = "findRew", type = "redirect", location = "html/bonusEdit.jsp")})
    public String findRewardAction() {
        Reward reward = rewardService.rewardByIdService(rewId);
        ActionContext.getContext().getSession().put("reward", reward);
        return "findRew";
    }

    @Action(value = "updateRewardAction", results = {@Result(name = "updateRew", type = "redirectAction", location = "allRewardAction")})
    public String updateReward() {
        rewardService.updateRewardService(reward);
        return "updateRew";
    }

    /*==============================================================部门表的增删改查======================================================================*/
    @Action(value = "allDeptAction", results = {@Result(name = "allDept", type = "redirect", location = "html/DeptList.jsp")})
    public String allDept() {
        List <Department> departmentList = departmentService.allDeptService(department);
        ActionContext.getContext().getSession().put("departmentList", departmentList);
        return "allDept";
    }

    @Action(value = "addDeptAction", results = {@Result(name = "addDpt", type = "redirectAction", location = "allDeptAction")})
    public String AddDept() {
        departmentService.addDeptService(department);
        return "addDpt";
    }

    @Action(value = "allDAction", results = {@Result(name = "allD", type = "redirect", location = "html/deptAdd.jsp")})
    public String allD() {
        List <Department> departmentList = departmentService.allDeptService(department);
        ActionContext.getContext().getSession().put("departmentList", departmentList);
        return "allD";
    }

    @Action(value = "deletDeptAction", results = {@Result(name = "delDept", type = "redirectAction", location = "allDeptAction")})
    public String deletDept() {
        departmentService.delDeptService(depId);
        return "delDept";
    }

    @Action(value = "findDeptAction", results = {@Result(name = "findDept", type = "redirect", location = "html/deptEdit.jsp")})
    public String findDept() {
        Department department = departmentService.deptByIdService(depId);
        ActionContext.getContext().getSession().put("department", department);
        return "findDept";
    }

    @Action(value = "updateDeptAction", results = {@Result(name = "updateDept", type = "redirectAction", location = "allDeptAction")})
    public String updateDept() {
        departmentService.updDeptService(department);
        return "updateDept";
    }

    /*=================================================等级表的增删改查========================================================================================*/
    @Action(value = "allLevelAction", results = {@Result(name = "allLevel", type = "redirect", location = "html/levelList.jsp")})
    public String allLe() {
        List <Level> levelList = levelService.allLevelService(level);
        ActionContext.getContext().getSession().put("levelList", levelList);
        return "allLevel";
    }

    @Action(value = "addLevelAction", results = {@Result(name = "addLevel", type = "redirectAction", location = "allLevelAction")})
    public String AddLe() {
        levelService.addLevService(level);
        return "addLevel";
    }

    @Action(value = "allLevAction", results = {@Result(name = "allL", type = "redirect", location = "html/LevelAdd.jsp")})
    public String allL() {
        List <Level> levelList = levelService.allLevelService(level);
        ActionContext.getContext().getSession().put("levelList", levelList);
        return "allL";
    }

    @Action(value = "deletDeptAction", results = {@Result(name = "delLevel", type = "redirectAction", location = "allLevelAction")})
    public String deletLe() {
        levelService.delLevService(levelId);
        return "delLevel";
    }

    @Action(value = "findLevelAction", results = {@Result(name = "findLevel", type = "redirect", location = "html/LevelEdit.jsp")})
    public String findLe() {
        Level level = levelService.LevByIdService(levelId);
        ActionContext.getContext().getSession().put("level", level);
        return "findLevel";
    }

    @Action(value = "updateLelAction", results = {@Result(name = "updateLevel", type = "redirectAction", location = "allLevelAction")})
    public String updateLe() {
        levelService.updLevService(level);
        return "updateLevel";
    }

    /*===================================================补贴表的增删改查==========================================================================================*/
    @Action(value = "allSubidyAction", results = {@Result(name = "allSub", type = "redirect", location = "html/subsidyList.jsp")})
    public String allSub() {
        List <Subsidy> subsidyList = subsidyService.allSubService(subsidy);
        ActionContext.getContext().getSession().put("subsidyList", subsidyList);
        return "allSub";
    }

    @Action(value = "addSubidyAction", results = {@Result(name = "addSub", type = "redirectAction", location = "allSubidyAction")})
    public String addSub() {
        subsidyService.addSubService(subsidy);
        return "addSub";
    }

    @Action(value = "allSAction", results = {@Result(name = "allS", type = "redirect", location = "html/subdiyAdd.jsp")})
    public String allS() {
        List <Subsidy> subsidyList = subsidyService.allSubService(subsidy);
        ActionContext.getContext().getSession().put("subsidyList", subsidyList);
        return "allS";
    }

    @Action(value = "delSubidyAction", results = {@Result(name = "delSub", type = "redirectAction", location = "allSubidyAction")})
    public String delSub() {
        subsidyService.delSubService(subsidyId);
        return "delSub";
    }

    @Action(value = "findSubidyAction", results = {@Result(name = "findSub", type = "redirect", location = "html/subidyEdit.jsp")})
    public String findSub() {
        Subsidy subsidy = subsidyService.subByIdService(subsidyId);
        ActionContext.getContext().getSession().put("subsidy", subsidy);
        return "findSub";
    }

    @Action(value = "updateSubidyAction", results = {@Result(name = "updateSub", type = "redirectAction", location = "allSubidyAction")})
    public String updateSub() {
        subsidyService.updSubService(subsidy);
        return "updateSub";
    }

    /*============================================================补贴记录表================================================================================*/
    @Action(value = "allSubLogAction", results = {@Result(name = "allSubL", type = "redirect", location = "html/subLogList.jsp")})
    public String allSubLog() {
        List <SubsidyLog> subsidyLogList = subsidyLogService.allSubLogService(subsidyLog);
        ActionContext.getContext().getSession().put("subsidyLogList", subsidyLogList);
        return "allSubL";
    }

    @Action(value = "allLikeSLAction", results = {@Result(name = "LikeSubL", type = "redirect", location = "html/subLogList.jsp")})
    public String SubLogLike() {
        List <SubsidyLog> subsidyLogList = subsidyLogService.subLogLikeService(subsidyLog);
        ActionContext.getContext().getSession().put("subsidyLogList", subsidyLogList);
        List<Staffinfo> staffinfoList=staffinfoService.allStaffService(staffinfo);
        ActionContext.getContext().getSession().put("staffinfoList",staffinfoList);
        return "LikeSubL";
    }

    @Action(value = "addSubLogAction", results = {@Result(name = "addSubL", type = "redirectAction", location = "allSubLogAction")})
    public String addSubLog() {
        subsidyLogService.addSubLogService(subsidyLog);
        return "addSubL";
    }

    @Action(value = "allSuLAction", results = {@Result(name = "allSL", type = "redirect", location = "html/subLogList.jsp")})
    public String allSL() {
        List <SubsidyLog> subsidyLogList = subsidyLogService.allSubLogService(subsidyLog);
        ActionContext.getContext().getSession().put("subsidyLogList", subsidyLogList);
        return "allSL";
    }

    @Action(value = "delSubLogAction", results = {@Result(name = "delSubL", type = "redirectAction", location = "allSubLogAction")})
    public String delSubLog() {
        subsidyLogService.delSubLogService(sublogId);
        return "delSubL";
    }

    /*  @Action(value = "findSubLogAction", results = {@Result(name = "findSubL", type = "redirect", location = "html/subLogEdit.jsp")})
  public String findSubLog(){
          SubsidyLog subsidyLog=subsidyLogService.subLogByIdService(sublogId);
          ActionContext.getContext().getSession().put("subsidyLog",subsidyLog);
          return "findSubL";
  }
  @Action(value = "updateSubLogAction", results = {@Result(name = "updateSubL", type = "redirectAction", location = "allSubLogAction")})
      public String updateSubLog(){
      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      subsidyLog.setSublogTime(sdf.format(new Date()));
          subsidyLogService.updSubLogService(subsidyLog);
          return "updateSubL";
  }*/
    /*====================================================店铺增删改查==================================================================*/
    @Action(value = "allShopAction", results = {@Result(name = "allShop", type = "redirect", location = "html/shopList.jsp")})
    public String allShop() {
        List <Shop> shopList = shopService.allShopService(shop);
        ActionContext.getContext().getSession().put("shopList", shopList);
        return "allShop";
    }

    @Action(value = "addShopAction", results = {@Result(name = "addShop", type = "redirectAction", location = "allShopAction")})
    public String addShop() {
        shopService.addShopService(shop);
        return "addShop";
    }

    @Action(value = "allShAction", results = {@Result(name = "allSh", type = "redirect", location = "html/shopAdd.jsp")})
    public String allSh() {
        List <Shop> shopList = shopService.allShopService(shop);
        ActionContext.getContext().getSession().put("shopList", shopList);
        return "allSh";
    }

    @Action(value = "delShopAction", results = {@Result(name = "delShop", type = "redirectAction", location = "allShopAction")})
    public String delShop() {
        shopService.delShopService(shopId);
        return "delShop";
    }

    @Action(value = "findShopAction", results = {@Result(name = "findShop", type = "redirect", location = "html/shopEdit.jsp")})
    public String findShop() {
        Shop shop = shopService.ShopByIdService(shopId);
        ActionContext.getContext().getSession().put("shop", shop);
        return "findShop";
    }

    @Action(value = "updateShopAction", results = {@Result(name = "updateShop", type = "redirectAction", location = "allShopAction")})
    public String updateShop() {
        shopService.updateShopService(shop);
        return "updateShop";
    }

    /*===========================================================考勤表的增删改查========================================================================*/
    @Action(value = "allAttdantceAction", results = {@Result(name = "allAttdantce", type = "redirect", location = "html/AttList.jsp")})
    public String allAttdantce() {
        List <Attendance> attendanceList = attendanceService.allAttendService(attendance);
        ActionContext.getContext().getSession().put("attendanceList", attendanceList);
        return "allAttdantce";
    }

    @Action(value = "addAttAction", results = {@Result(name = "addAtt", type = "redirectAction", location = "allAttdantceAction")})
    public String addAttdantce() {
        attendanceService.addAttendService(attendance);
        return "addAtt";
    }

    @Action(value = "allAttAction", results = {@Result(name = "allAtt", type = "redirect", location = "html/AttAdd.jsp")})
    public String allA() {
        List <Attendance> attendanceList = attendanceService.allAttendService(attendance);
        ActionContext.getContext().getSession().put("attendanceList", attendanceList);
        return "allAtt";
    }

    @Action(value = "delAttAction", results = {@Result(name = "delAtt", type = "redirectAction", location = "allAttdantceAction")})
    public String delAttdance() {
        attendanceService.deletAttendService(attId);
        return "delAtt";
    }

    @Action(value = "findAttAction", results = {@Result(name = "findAtt", type = "redirect", location = "html/AttEdit.jsp")})
    public String findAttdance() {
        Attendance attendance = attendanceService.AttendByIdService(attId);
        ActionContext.getContext().getSession().put("attendance", attendance);
        return "findAtt";
    }

    @Action(value = "upAttAction", results = {@Result(name = "upAtt", type = "redirectAction", location = "allAttdantceAction")})
    public String upAttdance() {
        attendanceService.updateAttendService(attendance);
        return "upAtt";
    }

    /*====================================================角色表的增删改============================================================================*/
    @Action(value = "allRolesAction", results = {@Result(name = "allRoles", type = "redirect", location = "html/rolesList.jsp")})
    public String allRoles() {
        List <Roles> roles1 = rolesService.allRolesService(roles);
        ActionContext.getContext().getSession().put("roles1", roles1);
        return "allRoles";
    }

    @Action(value = "addRolesAction", results = {@Result(name = "addRoler", type = "redirectAction", location = "allRolesAction")})
    public String addRoles() {
        rolesService.addRolesService(roles);
        return "addRoler";
    }

    @Action(value = "allRoAction", results = {@Result(name = "allR", type = "redirect", location = "html/rolesAdd.jsp")})
    public String allRole() {
        List <Roles> roles1 = rolesService.allRolesService(roles);
        ActionContext.getContext().getSession().put("roles1", roles1);
        return "allR";
    }

    @Action(value = "delRolesAction", results = {@Result(name = "delRoles", type = "redirectAction", location = "allRolesAction")})
    public String delRoles() {
        rolesService.deletRolesService(rolesId);
        return "delRoles";
    }

    @Action(value = "findRoAction", results = {@Result(name = "findRoles", type = "redirect", location = "html/rolesEdit.jsp")})
    public String findRoles() {
        Roles roles = rolesService.rolesByIdService(rolesId);
        ActionContext.getContext().getSession().put("roles", roles);
        return "findRoles";
    }

    @Action(value = "upRolesAction", results = {@Result(name = "upRoles", type = "redirectAction", location = "allRolesAction")})
    public String upRoles() {
        rolesService.updateRolesService(roles);
        return "upRoles";
    }
    /*===================================================考情记录表的增删改查=====================================================================================*/
    @Action(value = "allAttLogAction",results = {@Result(name = "allAttLog",type = "redirect",location = "html/attendanceList.jsp")})
    public String allAttLog(){
        List<AttendanceLog> attendanceLogs=attendanceLogService.allAttdenceLService(attendanceLog);
        ActionContext.getContext().getSession().put("attendanceLogs",attendanceLogs);
        return "allAttLog";
    }
    @Action(value = "addAttLogAction", results = {@Result(name = "addAttLog", type = "redirectAction", location = "allAttLogAction")})
    public  String addAttLog(){
        attendanceLogService.addAttdenceLService(attendanceLog);
        return "addAttLog";
    }
    @Action(value = "alAttLogAction",results = {@Result(name = "allAttLo",type = "redirect",location = "html/attendanceAdd.jsp")})
    public String allAttLo(){
        List<AttendanceLog> attendanceLogs=attendanceLogService.allAttdenceLService(attendanceLog);
        ActionContext.getContext().getSession().put("attendanceLogs",attendanceLogs);
        List<Staffinfo> staffinfoList=staffinfoService.allStaffService(staffinfo);
        ActionContext.getContext().getSession().put("staffinfoList",staffinfoList);
        List<Attendance> attendanceList=attendanceService.allAttendService(attendance);
        ActionContext.getContext().getSession().put("attendanceList",attendanceList);
        return "allAttLo";
    }
    @Action(value = "delAttLogAction", results = {@Result(name = "delAttLog", type = "redirectAction", location = "allAttLogAction")})
    public String delAttLog(){
        attendanceLogService.delAttdenceLService(attlogId);
        return "delAttLog";
    }
   /* @Action(value = "findAttLogAction",results = {@Result(name = "findAttLog",type = "redirect",location = "html/attendanceEdit.jsp")})
    public String findAttLog(){
        AttendanceLog attendanceLog=attendanceLogService.attdenceLByIdService(attlogId);
        ActionContext.getContext().getSession().put("attendanceLog",attendanceLog);
        return "findAttLog";
    }
    @Action(value = "upAttLogAction", results = {@Result(name = "upAttLog", type = "redirectAction", location = "allAttLogAction")})
    public String upAttLog(){
        attendanceLogService.upAttdenceLService(attendanceLog);
        return "upAttLog";
    }*/
/*=======================================================奖金记录的增删改查========================================================================*/
@Action(value = "allRewLogAction",results = {@Result(name = "allRewLog",type = "redirect",location = "html/rewardLogList.jsp")})
public String allRewLog(){
    List<RewardLog> rewardLogList=rewardLogService.allRewardLService();
    ActionContext.getContext().getSession().put("rewardLogList",rewardLogList);
    return "allRewLog";
}
    @Action(value = "addRewardLogAction", results = {@Result(name = "addRewardLog", type = "redirectAction", location = "allRewLogAction")})
public String addRewLog(){
    rewardLogService.addRewardLService(rewardLog);
    return "addRewardLog";
}
    @Action(value = "allRlAction",results = {@Result(name = "allRl",type = "redirect",location = "html/rewardLogAdd.jsp")})
public String allRl(){
    List<RewardLog> rewardLogList=rewardLogService.allRewardLService();
    ActionContext.getContext().getSession().put("rewardLogList",rewardLogList);
    return "allRl";
}
    @Action(value = "delRewardLogAction", results = {@Result(name = "delRewardLog", type = "redirectAction", location = "allRewLogAction")})
public String delRewardLog(){
    rewardLogService.delRewardLService(rewlogId);
    return "delRewardLog";
}
    @Action(value = "AlLikeRewLAction", results = {@Result(name = "allLikRewLog", type = "redirect", location = "html/rewardLogList.jsp")})
public String allLikeRewLog(){
    List<RewardLog> rewardLogList=rewardLogService.rewLogLikeService(rewardLog);
    ActionContext.getContext().getSession().put("rewardLogList",rewardLogList);
    return "allLikRewLog";
}
  /*  @Action(value = "findRewLogAction",results = {@Result(name = "findRL",type = "redirect",location = "html/rewardLogEdit.jsp")})
public String findRewLog(){
    RewardLog rewardLog=rewardLogService.rewardLByIdService(rewlogId);
    ActionContext.getContext().getSession().put("rewardLog",rewardLog);
    return "findRL";
}
@Action(value = "upRewardLogAction", results = {@Result(name = "upRewL", type = "redirectAction", location = "allRewLogAction")})
public String updateRewL(){
    rewardLogService.upRewardLService(rewardLog);
    return "upRewL";
}*/














    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffPwd() {
        return staffPwd;
    }

    public void setStaffPwd(String staffPwd) {
        this.staffPwd = staffPwd;
    }

    public Staffinfo getStaffinfo() {
        return staffinfo;
    }

    public void setStaffinfo(Staffinfo staffinfo) {
        this.staffinfo = staffinfo;
    }

    public void setStaffinfoService(StaffinfoService staffinfoService) {
        this.staffinfoService = staffinfoService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public LoginService getLoginService() {
        return loginService;
    }

    /*部门表的get-set方法*/
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getStaffPwd1() {
        return staffPwd1;
    }

    public String getStaffPwd2() {
        return staffPwd2;
    }

    public String getStaffPwd3() {
        return staffPwd3;
    }

    public void setStaffPwd1(String staffPwd1) {
        this.staffPwd1 = staffPwd1;
    }

    public void setStaffPwd2(String staffPwd2) {
        this.staffPwd2 = staffPwd2;
    }

    public void setStaffPwd3(String staffPwd3) {
        this.staffPwd3 = staffPwd3;
    }

    /*奖金表的get--set方法*/
    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public int getRewId() {
        return rewId;
    }

    public void setRewId(int rewId) {
        this.rewId = rewId;
    }

    public void setRewardService(RewardService rewardService) {
        this.rewardService = rewardService;
    }

    /*等级表的get-set方法*/
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setLevelService(LevelService levelService) {
        this.levelService = levelService;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    /*补贴表的get-set方法*/
    public Subsidy getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(Subsidy subsidy) {
        this.subsidy = subsidy;
    }

    public int getSubsidyId() {
        return subsidyId;
    }

    public void setSubsidyId(int subsidyId) {
        this.subsidyId = subsidyId;
    }

    public void setSubsidyService(SubsidyService subsidyService) {
        this.subsidyService = subsidyService;
    }

    /*补贴记录表的get-set方法*/
    public SubsidyLog getSubsidyLog() {
        return subsidyLog;
    }

    public void setSubsidyLog(SubsidyLog subsidyLog) {
        this.subsidyLog = subsidyLog;
    }

    public int getSublogId() {
        return sublogId;
    }

    public void setSublogId(int sublogId) {
        this.sublogId = sublogId;
    }

    public void setSubsidyLogService(SubsidyLogService subsidyLogService) {
        this.subsidyLogService = subsidyLogService;
    }

    /*店铺的get-set方法*/
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setShopService(ShopService shopService) {
        this.shopService = shopService;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    /*考勤表的get-set方法*/
    public Attendance getAttendance() { return attendance; }

    public void setAttendance(Attendance attendance) { this.attendance = attendance; }

    public int getAttId() { return attId; }

    public void setAttId(int attId) { this.attId = attId; }

    public void setAttendanceService(AttendanceService attendanceService) { this.attendanceService = attendanceService; }

    /*角色表的get-set方法*/
    public void setRolesService(RolesService rolesService) { this.rolesService = rolesService; }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) { this.roles = roles; }

    public int getRolesId() { return rolesId; }

    public void setRolesId(int rolesId) { this.rolesId = rolesId; }
    /*考情记录表的get-set方法*/

    public AttendanceLog getAttendanceLog() { return attendanceLog; }

    public void setAttendanceLog(AttendanceLog attendanceLog) { this.attendanceLog = attendanceLog; }

    public int getAttlogId() { return attlogId; }

    public void setAttlogId(int attlogId) { this.attlogId = attlogId; }

    public void setAttendanceLogService(AttendanceLogService attendanceLogService) { this.attendanceLogService = attendanceLogService; }
    /*奖金记录的get-set方法*/

    public RewardLog getRewardLog() {
        return rewardLog;
    }

    public void setRewardLog(RewardLog rewardLog) {
        this.rewardLog = rewardLog;
    }

    public int getRewlogId() {
        return rewlogId;
    }

    public void setRewlogId(int rewlogId) {
        this.rewlogId = rewlogId;
    }

    public void setRewardLogService(RewardLogService rewardLogService) {
        this.rewardLogService = rewardLogService;
    }
}
