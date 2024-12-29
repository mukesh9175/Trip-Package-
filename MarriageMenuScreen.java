package entryscreen;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import myUtility.*;
import myUtility.PanelState;
import ProjectSetting.*;
import HtmlSetting.*;




public class MarriageMenuScreen extends JPanel
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

	JLabel lblDataImage;

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
	JLabel lblSelectImage;


	JButton btnApply;


	JPanel pnlCombo1;
	JLabel lblCombo1;
	JComboBox cmbCombo1;




	public MarriageMenuScreen()
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

//		pnlImage.setBackground(clrpnlImage);
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

	//	pnlSelect.setBackground(ApplyColor.clrSelectPanel);
		pnlSelect.setLayout(new GridLayout(1,1));
		add(pnlSelect);

		lblSelectImage = new JLabel("",JLabel.CENTER);
		lblSelectImage.setIcon(new ImageIcon("Images\\Indian.jpg"));
		pnlSelect.add(lblSelectImage);

		CP.setXToRightOf(pnlLogo);
		CP.setYBelowOf(pnlProgramHeading);
		CP.setWidthBetween(pnlLogo,pnlImage);
		CP.setHeightBetween(pnlProgramHeading,pnlBottom);//setHeightPercentage(74);
		pnlEntry = CP.createPanel();

		pnlEntry.setBackground(ApplyColor.clrEntryPanel);
		pnlEntry.setLayout(null);
		add(pnlEntry);

		CP.addPanelAtTop(pnlSelect,10);
		pnlCombo1=CP.addPanel();
	//	pnlSelect.add(pnlCombo1);
		pnlCombo1.setLayout(new GridLayout(2,1));
		//pnlCombo1.setBackground(clrpnlCombo1);

		CP.addPanelAtBottom(pnlSelect,6);
		pnlApply=CP.addPanel();
	//	pnlSelect.add(pnlApply);
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
		System.out.println("width==>>  "+size.getWidth()+"Height"+size.getHeight());



		CP.addPanelAtLeft(pnlButton,7,6,10);
		pnlNew=CP.addPanel();
//		pnlButton.add(pnlNew);
		pnlNew.setLayout(null);
	//	pnlNew.setBackground(ApplyColor.clrMenuHeadButton);

		CP.addPanelAfterFromLeft(pnlButton,pnlNew,7,6,10);
		pnlSave=CP.addPanel();
//		pnlButton.add(pnlSave);
		pnlSave.setLayout(null);
	//	pnlSave.setBackground(Color.blue);


		CP.addPanelAfterFromLeft(pnlButton,pnlSave,7,6,10);
		pnlView=CP.addPanel();
//		pnlButton.add(pnlView);
		pnlView.setLayout(null);
	//	pnlView.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlView,7,6,10);
		pnlEdit=CP.addPanel();
//		pnlButton.add(pnlEdit);
		pnlEdit.setLayout(null);
	//	pnlEdit.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlEdit,7,6,10);
		pnlUpdate=CP.addPanel();
//		pnlButton.add(pnlUpdate);
		pnlUpdate.setLayout(null);
	//	pnlUpdate.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlUpdate,7,6,10);
		pnlDelete=CP.addPanel();
//		pnlButton.add(pnlDelete);
		pnlDelete.setLayout(null);
	//	pnlDelete.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlDelete,7,6,10);
		pnlClose=CP.addPanel();
//		pnlButton.add(pnlClose);
		pnlClose.setLayout(null);
	//	pnlClose.setBackground(Color.blue);

		CP.addPanelAfterFromLeft(pnlButton,pnlClose,7,6,10);
		pnlReport=CP.addPanel();
//		pnlButton.add(pnlReport);
		pnlReport.setLayout(null);
	//	pnlReport.setBackground(Color.blue);

		CP.addPanelAtLeft(pnlEntry,55);
		pnlData=CP.addPanel();
		pnlEntry.add(pnlData);
		pnlData.setLayout(null);
		pnlData.setBackground(ApplyColor.clrDataPanel);


		Dimension size1 = pnlData.getSize();
		System.out.println("width==>>  "+size1.getWidth()+"Height"+size1.getHeight());

		CP.addPanelAtLeft(pnlEntry,30);
		pnlDataReport=CP.addPanel();
		//pnlEntry.add(pnlDataReport);
		//pnlDataReport.setLayout(null);
	//	pnlDataReport.setBackground(ApplyColor.clrDataReportPanel);
		lblProjectHeading = new JLabel(ProjectTitle.getProjectTitle(),JLabel.CENTER);
	    lblProjectHeading.setForeground(ApplyColor.clrProjectHeadingText);
		pnlProjectHeading.add(lblProjectHeading);
		//HtmlStyle.applyH1(lblProjectHeading);


		lblProgrammeHeading = new JLabel("Marriage..... Program ",JLabel.CENTER);
		lblProgrammeHeading.setForeground(ApplyColor.clrProgramHeadingText);
		pnlProgramHeading.add(lblProgrammeHeading);

		lblCombo1 = new JLabel("                -------------------------  ");
		pnlCombo1.add(lblCombo1);

		cmbCombo1 = new JComboBox();
		cmbCombo1.addItem("No Record");
		pnlCombo1.add(cmbCombo1);

		btnApply = new JButton("Apply");
		btnApply.setBackground(ApplyColor.clrAllBackButton);
		pnlApply.add(btnApply);

		lblSetImage1 = new JLabel();
		lblSetImage1.setIcon(new ImageIcon("Images\\img3.jpg"));//
		pnlImageSubPanel1.add(lblSetImage1);

		lblSetImage2 = new JLabel();
		lblSetImage2.setIcon(new ImageIcon("Images\\Untitled.jpg"));
		pnlImageSubPanel2.add(lblSetImage2);

		lblLogo = new JLabel("",JLabel.CENTER);
		lblLogo.setIcon(new ImageIcon("Images\\logo2.jpg"));
		pnlLogo.add(lblLogo);

		lblBottomLeftImage = new JLabel("",JLabel.CENTER);
		lblBottomLeftImage.setIcon(new ImageIcon("Images\\ImgButtonLeft.jpg"));
		pnlBottomLeft.add(lblBottomLeftImage);

		lblBottomRightImage = new JLabel("",JLabel.RIGHT);
		lblBottomRightImage.setIcon(new ImageIcon("Images\\ImgButtonRight.jpg"));
		pnlBottomRight.add(lblBottomRightImage);

		btnNew = new JButton("New");
		btnNew.setBackground(ApplyColor.clrAllBackButton);
		pnlNew.add(btnNew);
		CP.placeComponent(pnlNew,btnNew);

		btnSave =  new JButton("Save");
		btnSave.setBackground(ApplyColor.clrAllBackButton);
		pnlSave.add(btnSave);
		CP.placeComponent(pnlSave,btnSave);

		btnView = new JButton("View");
		btnView.setBackground(ApplyColor.clrAllBackButton);
		pnlView.add(btnView);
		CP.placeComponent(pnlView,btnView);

		btnEdit = new JButton("Edit");
		btnEdit.setBackground(ApplyColor.clrAllBackButton);
		pnlEdit.add(btnEdit);
		CP.placeComponent(pnlEdit,btnEdit);

		btnUpdate = new JButton("Update");
		btnUpdate.setBackground(ApplyColor.clrAllBackButton);
		pnlUpdate.add(btnUpdate);
		CP.placeComponent(pnlUpdate,btnUpdate);

		btnDelete = new JButton("Delete");
		btnDelete.setBackground(ApplyColor.clrAllBackButton);
		pnlDelete.add(btnDelete);
		CP.placeComponent(pnlDelete,btnDelete);

		btnClose = new JButton("Close");
		btnClose.setBackground(ApplyColor.clrAllBackButton);
		pnlClose.add(btnClose);
		CP.placeComponent(pnlClose,btnClose);

		btnReport  =new JButton("Report");
		btnReport.setBackground(ApplyColor.clrAllBackButton);
		pnlReport.add(btnReport);
		CP.placeComponent(pnlReport,btnReport);






       setDefaultOperation();


	}
	public void setDefaultOperation()
	{
	//	PanelState.disabledComponents(pnlSelect);
	//	PanelState.disabledComponents(pnlData);
		//PanelState.disabledComponents(pnlDataReport);
		//PanelState.disabledComponents(pnlButton);

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
		Dimension ds=pnlDataReport.getParent().getSize();
		int pw = ds.width;
		int ph = ds.height;
		int x = (pw-rw)/2;
		int y = ((ph-rh)/2);

		pnlDataReport.setBounds(x,y,rw,rh);

	}


	public JPanel getEntryPanel()
	{
		return (pnlEntry);
	}
	public JPanel getDataPanel()
	{
		return (pnlData);
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
	public JComboBox getFirstComboBox()
	{
		return (cmbCombo1);
	}
	public JLabel getFirstComboLabel()
	{
		return (lblCombo1);
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

   public JLabel getDataImage()
   {
	  return (lblDataImage);

   }


}
