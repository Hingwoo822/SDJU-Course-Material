﻿<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Leaver_recordset.aspx.cs" Inherits="WebFiles_Leaver_Leaver_recordset" %>

<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>请假记录</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        <div style="z-index: 101; left: 206px; width: 790px; position: absolute; top: 223px;
            height: 164px">
            <table cellpadding="0" cellspacing="0" align="center">
                <tr>
                    <td bgcolor="#66c2de" colspan="3" style="width: 783px; height: 24px" align="center">
                        请假记录</td>
                </tr>
                <tr>
                    <td colspan="3" style="width: 783px" align="center">
                        <br />
                        <asp:GridView ID="ListLeaverRs" runat="server" CellPadding="4" ForeColor="#333333"
                            GridLines="None" Width="776px">
                            <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <RowStyle BackColor="#EFF3FB" />
                            <EditRowStyle BackColor="#2461BF" />
                            <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                            <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                            <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <AlternatingRowStyle BackColor="White" />
                        </asp:GridView>
                    </td>
                </tr>
            </table>
        </div>
        <uc2:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
</body>
</html>
