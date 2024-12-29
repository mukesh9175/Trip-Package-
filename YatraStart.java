package entryscreen;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import myUtility.*;
import ProjectSetting.*;
import HtmlSetting.*;


public class YatraStart extends JPanel
{

	JPanel pnlLogo;
	JPanel pnlProjectHeading;
	JPanel pnlProgramHeading;
	JPanel pnlImage;
	JPanel pnlSelect;
	JPanel pnlEntry;
	JPanel pnlBottom;
	JPanel pnlImageSubPanel1;
	JPanel pnlImageSubPanel2;
	JPanel pnlBottomLeft;
	JPanel pnlBottomRight;
	JPanel pnlButton;
	JPanel pnlData;
	//JPanel pnlDataReport;

	JLabel lblButtomImage;
	JLabel lblSelectPanelImg;








	JLabel lblProjectHeading;
	JLabel lblProgrammeHeading;
	JLabel lblSetImage1;
	JLabel lblSetImage2;
	JLabel lblLogo;
	JLabel lblBottomLeftImage;
	JLabel lblBottomRightImage;





	JPanel pnlButtonFirst;
	JButton btnButtonFirst;
	JPanel pnlButtonSecond;;
	JButton btnButtonSecond;
    JPanel pnlButtonThird;
	JButton btnButtonThird;
    JPanel pnlButtonFourth;
	JButton btnButtonFourth;
    JPanel pnlButtonFive;
	JButton btnButtonFive;
	JPanel pnlButtonSix;
	JButton btnButtonSix;






	public YatraStart()
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

		pnlSelect.setBackground(ApplyColor.clrMenuSelectPanel);
		pnlSelect.setLayout(new GridLayout(1,1));
		add(pnlSelect);


		CP.setXToRightOf(pnlLogo);
		CP.setYBelowOf(pnlProgramHeading);
		CP.setWidthBetween(pnlLogo,pnlImage);
		CP.setHeightBetween(pnlProgramHeading,pnlBottom);//setHeightPercentage(74);
		pnlEntry = CP.createPanel();

		pnlEntry.setBackground(ApplyColor.clrEntryPanel);
		pnlEntry.setLayout(null);
		add(pnlEntry);

		//pnlCombo6.setBackground(clrpnlCombo1);

		/*CP.addPanelAfterFromTop(pnlSelect,pnlButtonSix,10);
		pnlButtonSeven=CP.addPanel();
		pnlSelect.add(pnlButtonSeven);
		pnlButtonSeven.setLayout(new GridLayout(1,1));
		//pnlCombo6.setBackground(clrpnlCombo1);*/


		CP.addPanelAtBottom(pnlSelect,6);
//		pnlApply=CP.addPanel();
//		pnlSelect.add(pnlApply);
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
		pnlButton.setLayout(new GridLayout(1,1));
		pnlButton.setBackground(ApplyColor.clrButtonPanel);
		Dimension size = pnlBottom.getSize();


		/*CP.addPanelAtLeft(pnlButton,7,6,10);
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
		pnlReport.setBackground(Color.blue);*/

		CP.addPanelAtLeft(pnlEntry,30);
		pnlData=CP.addPanel();
		pnlEntry.add(pnlData);
		pnlData.setLayout(null);
		pnlData.setBackground(ApplyColor.clrMenuTitlePanel);

		/*CP.addPanelAtLeft(pnlEntry,30);
		pnlDataReport=CP.addPanel();
		pnlEntry.add(pnlDataReport);
		pnlDataReport.setLayout(null);
		pnlDataReport.setBackground(ApplyColor.clrSubMenuFirstPanel);*/





		lblProjectHeading = new JLabel(ProjectTitle.getProjectTitle(),JLabel.CENTER);
		lblProjectHeading.setForeground(ApplyColor.clrProjectHeadingText);
		pnlProjectHeading.add(lblProjectHeading);
		HtmlStyle.applyH1(lblProjectHeading);


		lblProgrammeHeading = new JLabel("Galaxy ..... Program Information",JLabel.CENTER);
			lblProgrammeHeading.setForeground(ApplyColor.clrProgramHeadingText);
		pnlProgramHeading.add(lblProgrammeHeading);


		lblSetImage1 = new JLabel();
		lblSetImage1.setIcon(new ImageIcon("Images\\ImgTop1.JPG"));
		pnlImageSubPanel1.add(lblSetImage1);

		lblSetImage2 = new JLabel();
		lblSetImage2.setIcon(new ImageIcon("Images\\ImgTop2.jpg"));
		pnlImageSubPanel2.add(lblSetImage2);

		lblLogo = new JLabel("",JLabel.CENTER);
		lblLogo.setIcon(new ImageIcon("Images\\ImgLogo.JPG"));
		pnlLogo.add(lblLogo);

		lblBottomLeftImage = new JLabel("");
		lblBottomLeftImage.setIcon(new ImageIcon("Images\\abc.jpg"));
		pnlBottomLeft.add(lblBottomLeftImage);

		lblBottomRightImage = new JLabel("",JLabel.RIGHT);
		lblBottomRightImage.setIcon(new ImageIcon("Images\\www.jpg"));
		pnlBottomRight.add(lblBottomRightImage);

		lblButtomImage = new JLabel("");
		lblButtomImage.setIcon(new ImageIcon("Images\\ImgButtonPanelFinal.JPG"));
		pnlButton.add(lblButtomImage);

       lblSelectPanelImg = new JLabel("");
       lblSelectPanelImg.setIcon(new ImageIcon("Images\\selectPanelImage.JPG"));
		pnlSelect.add(lblSelectPanelImg);

       setDefaultOperation();



	}
	public void setDefaultOperation()
	{
		//PanelState.disabledComponents(pnlSelect);
	//	PanelState.disabledComponents(pnlData);
		//PanelState.disabledComponents(pnlDataReport);
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
	public JPanel getEntryPanel()
	{
			return (pnlEntry);
	}
	public JPanel getDataPanel()
	{
		return (pnlData);
	}


	public JPanel getSelectPanel()
	{
		return (pnlSelect);
	}

	public JButton getFirstButtonPanel()
	{
		return (btnButtonFirst);
	}

	public JButton getButtonFirstButton()
	{
		return (btnButtonFirst);
	}

	public JButton getButtonSecondButton()
	{
	return (btnButtonSecond);
	}
	public JButton getButtonThirdButton()
	{
	return (btnButtonThird);
	}

	public JButton getButtonFourthButton()
	{
	return (btnButtonFourth);
	}
	public JButton getButtonFiveButton()
	{
	return (btnButtonFive);
	}

	public JButton getButtonSixButton()
	{
	return (btnButtonSix);
	}



	public JLabel getProjectHeading()
	{
		return (lblProjectHeading);
	}

   public JLabel getProgrammeHeading()
   {
	  return (lblProgrammeHeading);

   }
}
