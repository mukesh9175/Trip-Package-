package entryscreen;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import myUtility.*;
import ProjectSetting.*;
import HtmlSetting.*;


public class EntryScreen7 extends JPanel
{

	JPanel pnlLogo;
	JPanel pnlProjectHeading;
	JPanel pnlProgramHeading;
	JPanel pnlImage;
	JPanel pnlSelect;
	JPanel pnlEntry;
	JPanel pnlBottom;
	JPanel pnlApply;
	JPanel pnlImageSubPanel1;
	JPanel pnlImageSubPanel2;
	JPanel pnlBottomLeft;
	JPanel pnlBottomRight;
	JPanel pnlButton;
	JPanel pnlData;
	JPanel pnlDataReport;

	JPanel pnlNew;
	JPanel pnlSave;
	JPanel pnlView;
	JPanel pnlEdit;
	JPanel pnlUpdate;
	JPanel pnlDelete;
	JPanel pnlClose;
	JPanel pnlReport;

	JButton btnSave;
	JButton btnNew;
	JButton btnUpdate;
	JButton btnDelete;
	JButton btnEdit;
	JButton btnView;
	JButton btnClose;
	JButton btnReport;







	JLabel lblProjectHeading;
	JLabel lblProgrammeHeading;
	JLabel lblSetImage1;
	JLabel lblSetImage2;
	JLabel lblLogo;
	JLabel lblBottomLeftImage;
	JLabel lblBottomRightImage;


	JButton btnApply;


	JPanel pnlCombo1;
	JLabel lblCombo1;
	JComboBox cmbCombo1;


	JPanel pnlCombo2;
	JLabel lblCombo2;
	JComboBox cmbCombo2;

	JPanel pnlCombo3;
	JLabel lblCombo3;
	JComboBox cmbCombo3;


	JPanel pnlCombo4;
	JLabel lblCombo4;
	JComboBox cmbCombo4;

	JPanel pnlCombo5;
	JLabel lblCombo5;
	JComboBox cmbCombo5;

	JPanel pnlCombo6;
	JLabel lblCombo6;
	JComboBox cmbCombo6;

	JPanel pnlCombo7;
	JLabel lblCombo7;
	JComboBox cmbCombo7;






	public EntryScreen7()
	{


		Color borderColor=Color.black;
		Border borderLineBorder = BorderFactory.createLineBorder(borderColor);
		Border Border1 = BorderFactory.createMatteBorder(2,2,2,2,Color.decode("#483D8B"));

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		setSize(screenSize.width,screenSize.height);
		setLocation(0,0);
		setLayout(null);

		CreatePanel CP = new CreatePanel(screenSize.width,screenSize.height);
		CP.setGap(5,5);


		setBackground(ApplyColor.clrBackColor);

		CP.setXToLeftOf(this);
		CP.setYToTopOf(this);
		CP.setWidthPercentage(17);
		CP.setHeightPercentage(15);
		pnlLogo = CP.createPanel();

		pnlLogo.setBackground(ApplyColor.clrLogoPanel);
		pnlLogo.setLayout(new GridLayout(1,1));
		add(pnlLogo);


		CP.setXToLeftOf(this);
		CP.setPanelToBottom(11);
		CP.setWidthTillEnd(this);

		pnlBottom = CP.createPanel();

		pnlBottom.setBackground(ApplyColor.clrBottomPanel);
		pnlBottom.setLayout(null);
		add(pnlBottom);

		CP.setXToRightOf(pnlLogo);
		CP.setYToTopOf(this);
		CP.setWidthTillEndFrom(pnlLogo);
		CP.setHeightPercentage(5);
		pnlProjectHeading = CP.createPanel();

		pnlProjectHeading.setBackground(ApplyColor.clrProjectHeadingPanel);
		pnlProjectHeading.setLayout(new GridLayout(1,1));
		add(pnlProjectHeading);


		CP.setPanelToRight(26);
		CP.setYBelowOf(pnlProjectHeading);
		CP.setHeightBetween(pnlProjectHeading,pnlBottom);//setHeightPercentage(80);
		pnlImage = CP.createPanel();

		//pnlImage.setBackground(clrpnlImage);
		pnlImage.setLayout(new GridLayout(2,1,5,5));
		add(pnlImage);


		CP.setXToRightOf(pnlLogo);
		CP.setYBelowOf(pnlProjectHeading);
		CP.setWidthBetween(pnlLogo,pnlImage);
		CP.setHeightPercentage(5);
		pnlProgramHeading = CP.createPanel();

		pnlProgramHeading.setBackground(ApplyColor.clrProgramHeadingPanel);
		pnlProgramHeading.setLayout(new GridLayout(1,1));
		add(pnlProgramHeading);



		CP.setXToLeftOf(this);;
		CP.setYBelowOf(pnlLogo);
		CP.setWidthPercentage(17);
		CP.setHeightBetween(pnlLogo,pnlBottom);//setHeightPercentage(70);
		pnlSelect = CP.createPanel();

		pnlSelect.setBackground(ApplyColor.clrSelectPanel);
		pnlSelect.setLayout(null);
		add(pnlSelect);


		CP.setXToRightOf(pnlLogo);
		CP.setYBelowOf(pnlProgramHeading);
		CP.setWidthBetween(pnlLogo,pnlImage);
		CP.setHeightBetween(pnlProgramHeading,pnlBottom);//setHeightPercentage(74);
		pnlEntry = CP.createPanel();

		pnlEntry.setBackground(ApplyColor.clrEntryPanel);
		pnlEntry.setLayout(null);
		add(pnlEntry);

		CP.addPanelAtTop(pnlSelect,8);
		pnlCombo1=CP.addPanel();
		pnlSelect.add(pnlCombo1);
		pnlCombo1.setLayout(new GridLayout(2,1));
		//pnlCombo1.setBackground(clrpnlCombo1);

		CP.addPanelAfterFromTop(pnlSelect,pnlCombo1,8);
		pnlCombo2=CP.addPanel();
		pnlSelect.add(pnlCombo2);
		pnlCombo2.setLayout(new GridLayout(2,1));
		//pnlCombo2.setBackground(clrpnlCombo1);


		CP.addPanelAfterFromTop(pnlSelect,pnlCombo2,8);
		pnlCombo3=CP.addPanel();
		pnlSelect.add(pnlCombo3);
		pnlCombo3.setLayout(new GridLayout(2,1));
		//pnlCombo3.setBackground(clrpnlCombo1);

		CP.addPanelAfterFromTop(pnlSelect,pnlCombo3,8);
		pnlCombo4=CP.addPanel();
		pnlSelect.add(pnlCombo4);
		pnlCombo4.setLayout(new GridLayout(2,1));
		//pnlCombo4.setBackground(clrpnlCombo1);

		CP.addPanelAfterFromTop(pnlSelect,pnlCombo4,8);
		pnlCombo5=CP.addPanel();
		pnlSelect.add(pnlCombo5);
		pnlCombo5.setLayout(new GridLayout(2,1));
		//pnlCombo5.setBackground(clrpnlCombo1);

		CP.addPanelAfterFromTop(pnlSelect,pnlCombo5,8);
		pnlCombo6=CP.addPanel();
		pnlSelect.add(pnlCombo6);
		pnlCombo6.setLayout(new GridLayout(2,1));
		//pnlCombo6.setBackground(clrpnlCombo1);

		CP.addPanelAfterFromTop(pnlSelect,pnlCombo6,8);
		pnlCombo7=CP.addPanel();
		pnlSelect.add(pnlCombo7);
		pnlCombo7.setLayout(new GridLayout(2,1));
		//pnlCombo6.setBackground(clrpnlCombo1);


		CP.addPanelAtBottom(pnlSelect,6);
		pnlApply=CP.addPanel();
		pnlSelect.add(pnlApply);
		pnlApply.setLayout(new GridLayout(1,1));
		//pnlApply.setBackground(clrpnlCombo1);

		CP.addPanelAtTop(pnlImage,49);
		pnlImageSubPanel1=CP.addPanel();
		pnlImage.add(pnlImageSubPanel1);
		pnlImageSubPanel1.setLayout(new GridLayout(1,1));
		pnlImageSubPanel1.setBackground(ApplyColor.clrImageSubPanel1);

		CP.addPanelAtBottom(pnlImage,49);
		pnlImageSubPanel2=CP.addPanel();
		pnlImage.add(pnlImageSubPanel2);
		pnlImageSubPanel2.setLayout(new GridLayout(1,1));
		pnlImageSubPanel2.setBackground(ApplyColor.clrImageSubPanel2);


		CP.addPanelAtLeft(pnlBottom,20);
		pnlBottomLeft=CP.addPanel();
		pnlBottom.add(pnlBottomLeft);
		pnlBottomLeft.setLayout(new GridLayout(1,1));
		pnlBottomLeft.setBackground(ApplyColor.clrBottomLeftPanel);

		CP.addPanelAtRight(pnlBottom,18);
		pnlBottomRight=CP.addPanel();
		pnlBottom.add(pnlBottomRight);
		pnlBottomRight.setLayout(new GridLayout(1,1));
		pnlBottomRight.setBackground(ApplyColor.clrBottomRightPanel);

		CP.addPanelBetween(pnlBottom,pnlBottomLeft,pnlBottomRight);
		pnlButton=CP.addPanel();
		pnlBottom.add(pnlButton);
		pnlButton.setLayout(null);
		pnlButton.setBackground(ApplyColor.clrButtonPanel);
		Dimension size = pnlBottom.getSize();


		CP.addPanelAtLeft(pnlButton,7,6,10);
		pnlNew=CP.addPanel();
		pnlButton.add(pnlNew);
		pnlNew.setLayout(null);
		pnlNew.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlNew,7,6,10);
		pnlSave=CP.addPanel();
		pnlButton.add(pnlSave);
		pnlSave.setLayout(null);
		pnlSave.setBackground(Color.blue);


		CP.addPanelAfterFromLeft(pnlButton,pnlSave,7,6,10);
		pnlView=CP.addPanel();
		pnlButton.add(pnlView);
		pnlView.setLayout(null);
		pnlView.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlView,7,6,10);
		pnlEdit=CP.addPanel();
		pnlButton.add(pnlEdit);
		pnlEdit.setLayout(null);
		pnlEdit.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlEdit,7,6,10);
		pnlUpdate=CP.addPanel();
		pnlButton.add(pnlUpdate);
		pnlUpdate.setLayout(null);
		pnlUpdate.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlUpdate,7,6,10);
		pnlDelete=CP.addPanel();
		pnlButton.add(pnlDelete);
		pnlDelete.setLayout(null);
		pnlDelete.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlDelete,7,6,10);
		pnlClose=CP.addPanel();
		pnlButton.add(pnlClose);
		pnlClose.setLayout(null);
		pnlClose.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlClose,7,6,10);
		pnlReport=CP.addPanel();
		pnlButton.add(pnlReport);
		pnlReport.setLayout(null);
		pnlReport.setBackground(Color.blue);

		CP.addPanelAtLeft(pnlEntry,30);
		pnlData=CP.addPanel();
		pnlEntry.add(pnlData);
		pnlData.setLayout(null);
		pnlData.setBackground(ApplyColor.clrDataPanel);

		CP.addPanelAtLeft(pnlEntry,30);
		pnlDataReport=CP.addPanel();
		pnlEntry.add(pnlDataReport);
		pnlDataReport.setLayout(null);
		pnlDataReport.setBackground(ApplyColor.clrSubMenuFirstPanel);





		lblProjectHeading = new JLabel(ProjectTitle.getProjectTitle(),JLabel.CENTER);
		lblProjectHeading.setForeground(ApplyColor.clrProjectHeadingText);
		pnlProjectHeading.add(lblProjectHeading);
		HtmlStyle.applyH1(lblProjectHeading);


		lblProgrammeHeading = new JLabel("Galaxy ..... Program Information",JLabel.CENTER);
		lblProgrammeHeading.setForeground(ApplyColor.clrProgramHeadingText);
		pnlProgramHeading.add(lblProgrammeHeading);

		lblCombo1 = new JLabel("-------------------------");
		pnlCombo1.add(lblCombo1);

		cmbCombo1 = new JComboBox();
		cmbCombo1.addItem("No Record");
		pnlCombo1.add(cmbCombo1);


		lblCombo2 = new JLabel("-------------------------");
		pnlCombo2.add(lblCombo2);

		cmbCombo2 = new JComboBox();
		cmbCombo2.addItem("No Record");
		pnlCombo2.add(cmbCombo2);


		lblCombo3 = new JLabel("-------------------------");
		pnlCombo3.add(lblCombo3);

		cmbCombo3 = new JComboBox();
		cmbCombo3.addItem("No Record");
		pnlCombo3.add(cmbCombo3);

		lblCombo4 = new JLabel("-------------------------");
		pnlCombo4.add(lblCombo4);

		cmbCombo4 = new JComboBox();
		cmbCombo4.addItem("No Record");
		pnlCombo4.add(cmbCombo4);


		lblCombo5 = new JLabel("-------------------------");
		pnlCombo5.add(lblCombo5);

		cmbCombo5 = new JComboBox();
		cmbCombo5.addItem("No Record");
		pnlCombo5.add(cmbCombo5);

		lblCombo6 = new JLabel("-------------------------");
		pnlCombo6.add(lblCombo6);

		cmbCombo6 = new JComboBox();
		cmbCombo6.addItem("No Record");
		pnlCombo6.add(cmbCombo6);


		lblCombo7 = new JLabel("-------------------------");
		pnlCombo7.add(lblCombo7);

		cmbCombo7 = new JComboBox();
		cmbCombo7.addItem("No Record");
		pnlCombo7.add(cmbCombo7);



		btnApply = new JButton("Apply");
		pnlApply.add(btnApply);
		btnApply.setBackground(ApplyColor.clrApplyButton);

		lblSetImage1 = new JLabel();
		lblSetImage1.setIcon(new ImageIcon("Images\\ImgTop1.jpg"));
		pnlImageSubPanel1.add(lblSetImage1);

		lblSetImage2 = new JLabel();
		lblSetImage2.setIcon(new ImageIcon("Images\\ImgTop2.jpg"));
		pnlImageSubPanel2.add(lblSetImage2);

		lblLogo = new JLabel("",JLabel.CENTER);
		lblLogo.setIcon(new ImageIcon("Images\\ImgLogo.jpg"));
		pnlLogo.add(lblLogo);

		lblBottomLeftImage = new JLabel("",JLabel.CENTER);
	    lblBottomLeftImage.setIcon(new ImageIcon("Images\\abc.jpg"));
		pnlBottomLeft.add(lblBottomLeftImage);

		lblBottomRightImage = new JLabel("",JLabel.RIGHT);
		lblBottomRightImage.setIcon(new ImageIcon("Images\\www.jpg"));
		pnlBottomRight.add(lblBottomRightImage);

		btnNew = new JButton("New");
		pnlNew.add(btnNew);
		btnNew.setBackground(ApplyColor.clrAllBackButton);
		CP.placeComponent(pnlNew,btnNew);


		btnSave =  new JButton("Save");
		pnlSave.add(btnSave);
		btnSave.setBackground(ApplyColor.clrAllBackButton);
		CP.placeComponent(pnlSave,btnSave);



		btnView = new JButton("View");
		pnlView.add(btnView);
		btnView.setBackground(ApplyColor.clrAllBackButton);
		CP.placeComponent(pnlView,btnView);


		btnEdit = new JButton("Edit");
		pnlEdit.add(btnEdit);
		btnEdit.setBackground(ApplyColor.clrAllBackButton);
		CP.placeComponent(pnlEdit,btnEdit);



		btnUpdate = new JButton("Update");
		pnlUpdate.add(btnUpdate);
	    btnUpdate.setBackground(ApplyColor.clrAllBackButton);
	    CP.placeComponent(pnlUpdate,btnUpdate);



		btnDelete = new JButton("Delete");
		pnlDelete.add(btnDelete);
		btnDelete.setBackground(ApplyColor.clrAllBackButton);
		CP.placeComponent(pnlDelete,btnDelete);


		btnClose = new JButton("Close");
		pnlClose.add(btnClose);
		btnClose.setBackground(ApplyColor.clrAllBackButton);
		CP.placeComponent(pnlClose,btnClose);


		btnReport  =new JButton("Report");
		pnlReport.add(btnReport);
		btnReport.setBackground(ApplyColor.clrAllBackButton);
		CP.placeComponent(pnlReport,btnReport);








       setDefaultOperation();


	}
	public void setDefaultOperation()
	{
	//	PanelState.disabledComponents(pnlSelect);
	//	PanelState.disabledComponents(pnlData);
	//	PanelState.disabledComponents(pnlDataReport);
	//	PanelState.disabledComponents(pnlButton);

	}
	public void UIAreaSetting(int rw,int rh)
	{
		Dimension ds=pnlData.getParent().getSize();
		int pw = ds.width;
		int ph = ds.height;
		int x = (pw-rw)/2;
		int y = ((ph-rh)/2);

		pnlData.setBounds(x,y,rw,rh);

	}
	public void ReportAreaSetting(int rw,int rh)
	{
		Dimension ds=pnlData.getParent().getSize();
		int pw = ds.width;
		int ph = ds.height;
		int x = (pw-rw)/2;
		int y = ((ph-rh)/2);

		pnlDataReport.setBounds(x,y,rw,rh);

	}

	public JPanel getDataPanel()
	{
		return (pnlData);
	}
	public JPanel getEntryPanel()
	{
		return(pnlEntry);
	}
	public JPanel getDataReportPanel()
	{
		return (pnlDataReport);
	}

	public JPanel getSelectPanel()
	{
		return (pnlSelect);
	}
	public JPanel getNewPanel()
	{
		return (pnlNew);
	}
	public JButton getNewButton()
	{
		return (btnNew);
	}
	public JPanel getSavePanel()
	{
		return (pnlSave);
	}
	public JButton getSaveButton()
	{
		return (btnSave);
	}
	public JPanel getViewPanel()
	{
		return (pnlView);
	}
	public JButton getViewButton()
	{
		return (btnView);
	}
	public JPanel getEditPanel()
	{
		return (pnlEdit);
	}
	public JButton getEditButton()
	{
		return (btnEdit);
	}
	public JPanel getUpdatePanel()
	{
		return (pnlUpdate);
	}
	public JButton getUpdateButton()
	{
		return (btnUpdate);
	}
	public JPanel getDeletePanel()
	{
		return (pnlDelete);
	}
	public JButton getDeleteButton()
	{
		return (btnDelete);
	}
	public JPanel getClosePanel()
	{
		return (pnlClose);
	}
	public JButton getCloseButton()
	{
		return (btnClose);
	}
	public JPanel getReportPanel()
	{
		return (pnlReport);
	}
	public JButton getReportButton()
	{
		return (btnReport);
	}
	public JPanel getFirstComboPanel()
	{
		return (pnlCombo1);
	}
	public JLabel getFirstComboLabel()
	{
		return (lblCombo1);
	}
	public JComboBox getFirstComboBox()
	{
		return (cmbCombo1);
	}

	public JPanel getSecondComboPanel()
	{
		return (pnlCombo2);
	}
	public JLabel getSecondComboLabel()
	{
		return (lblCombo2);
	}
	public JComboBox getSecondComboBox()
	{
		return (cmbCombo2);
	}


	public JPanel getThirdComboPanel()
	{
		return (pnlCombo3);
	}
	public JLabel getThirdComboLabel()
	{
		return (lblCombo3);
	}
	public JComboBox getThirdComboBox()
	{
		return (cmbCombo3);
	}

	public JPanel getFourthComboPanel()
	{
		return (pnlCombo4);
	}
	public JLabel getFourthComboLabel()
	{
		return (lblCombo4);
	}
	public JComboBox getFourthComboBox()
	{
		return (cmbCombo4);
	}


	public JPanel getFiveComboPanel()
	{
		return (pnlCombo5);
	}
	public JLabel getFiveComboLabel()
	{
		return (lblCombo5);
	}
	public JComboBox getFiveComboBox()
	{
		return (cmbCombo5);
	}

	public JPanel getSixComboPanel()
	{
		return (pnlCombo6);
	}
	public JLabel getSixComboLabel()
	{
		return (lblCombo6);
	}
	public JComboBox getSixComboBox()
	{
		return (cmbCombo6);
	}

	public JPanel getSevenComboPanel()
	{
		return (pnlCombo7);
	}
	public JLabel getSevenComboLabel()
	{
		return (lblCombo7);
	}
	public JComboBox getSevenComboBox()
	{
		return (cmbCombo7);
	}
	public JPanel getApplyPanel()
	{
		return (pnlApply);
	}
	public JButton getApplyButton()
	{
		return (btnApply);
	}

   public JLabel getProgrammeHeading()
   {
	  return (lblProgrammeHeading);

   }

    public JLabel getProjectHeading()
    {
 	  return (lblProjectHeading);

   }
}
