using System;
using System.Data;
using System.Configuration;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using Oracle.DataAccess.Client;
using Oracle.DataAccess.Client;
public partial class _Default : System.Web.UI.Page 
{
     #region Web ������������ɵĴ���
        override protected void OnInit(EventArgs e)
        {
            //
            // CODEGEN: �õ����� ASP.NET Web ���������������ġ�
            //
            InitializeComponent();
            base.OnInit(e);
        }

        /// <summary>
        /// �����֧������ķ��� - ��Ҫʹ�ô���༭���޸�
        /// �˷��������ݡ�
        /// </summary>
        private void InitializeComponent()
        {
            


        }
        #endregion
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Btn_Login_Click(object sender, EventArgs e)
    {

        if (TxtUser.Text.Trim() == "")
        {
            Response.Write("<script>alert('��¼������Ϊ��')</script>");
            return;
        }
        user userLogin = new user();
        bool isok = false;
       
        if (rb_admin.Checked)
        {     
           
            string sql = "select * from Tb_User_Login where userName='" + TxtUser.Text.Trim() + "' and userPass='" + TxtPwd.Text.Trim() + "'and userRole='" + rb_admin.Text + "'";
            OracleDataReader myReader = userLogin.Login(sql);
            if (myReader.Read())
            {
                Session["Name"] = myReader["userName"].ToString().Trim();//�����û�����
                Session["Pass"] = myReader["userPass"].ToString().Trim();//�����û�����
                Session["Role"] = myReader["userRole"].ToString().Trim();//�����û�Ȩ��.		
                isok = true;
            }
            myReader.Close();
        }
       else
        { 
            string sql = "select * from Tb_User_Login where userName='" + TxtUser.Text.Trim() + "' and userPass='" + TxtPwd.Text.Trim() + "'and userRole='" + rb_user.Text+ "'";
            OracleDataReader myReader = userLogin.Login(sql);
            if (myReader.Read())

            {
                Session["Name"] = myReader["userName"].ToString().Trim();//�����û�����
                Session["Pass"] = myReader["userPass"].ToString().Trim();//�����û�����
                Session["Role"] = myReader["userRole"].ToString().Trim();//�����û�Ȩ��.		
                isok = true;
            }     
            myReader.Close();
        }



           if (!isok)
         {
             lbMessage.Text = "�û����ƻ�������󣬵�½ʧ��!";
              return;
         }
           else
           {
             Response.Redirect("Index.aspx");
          }
    }
    protected void Btn_Cancel_Click(object sender, EventArgs e)
    {
        TxtUser.Text = "";
        TxtPwd.Text = "";
        lbMessage.Text = "";
    }
    
}



















