package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel
{

	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        BufferedImage spriteSheet = null;
		try {
			spriteSheet = ImageIO.read(new File("C:\\Users\\cbdra\\Documents\\EXIA\\Projet\\Projet (Boulder Dash)\\74359.png"));
			//buildMap(spriteSheet, g);
			int n = 0;
	        char map[][] = new char[992][992];
	        // on r�cup�re la string de la map
	        String mapString = "000000000000000000000000000000031222211111112111122222211190011122211111441444111111111150011111212111444444111111111110011221115111118411166666666660011122111111111111112111111110011112222111111111112121111110011111122111111111212121222110011111111111111112211121111110066666666666666111111166666660011112111111111121111111111110015111111122211121111111111110011111111111111121111111111110011444411111111111447411121110011474411111111111454411111110011441111111111111111111111110011441111211111111111111111110011111111111111111111111111110011111111111111111111111111110011111116666666666666666666660012111111111111111112211111110011111111111111111111111121110011111121111111121114411111110011111111111112211118411111110011511111111211111111111115110011111111111111211111111111110011111148111111111111121111110011111144111111511111111111110011111111111111111111111111110000000000000000000000000000000";
	        // Map 1
	        //String mapString = "000000000000000000000000000000051111111174444411111111222110011481221145445412211212221110011442211144444411222212211110011222111154474511122212214440011211111185555411111111114440011111111144444411111211114740066666666666666666666211111110022221111111111111111111111110012221112222222222211111112220012121112222222222211111222220012121114444444444411112222440011111118787878787811111111110044444666666666666666611116660047474614444444444412611116220011111624444434444422614446150011511621111111111122614841110011111621111111111111111111150011511622222222222222611111110066666666666666666666611116660051111111111111111111144441110011111111111111112221147441110011111111111111222222111111150011111111421112622222222111510011111111422122622222222216660011111447412221611111111111110066666444511211611111111115150051111111411111611144744411510055111111411111691144544415150000000000000000000000000000000";
	        // Map 2
	        //String mapString = "000000000000000000000000000000011111111111222222112222611510022211111111111512112222611110011222112111111112111222611110011111142411111211111112611110011511144411111111111111611110011111148411111111111111611110011222166666666666662222222210011211144411111221161111111110012221147411211222161444474410012221166611211122261411111410012221144411211112261414841410011111145411211111111414541410011111144411111122111414541410051111111111111221111414441410066666666111112211111411111410034112222111122541111444444410044412222221221481111111111110014511111221111111112266666660011111119111111111122162111160021161111121111112221161445110021161122221111111111111448410021561222226666666611111444410021661111111111114411111544410011611122111111117411111111110011611112222111111111111111110011661111112222111112666666660044161111111111111511222211110047561111111111111111111151110000000000000000000000000000000";
	        // Map 3
	        //String mapString = "000000000000000000000000000000034122222211112222266914441150044115115114441111166184411110011111111114544444166444112210011121221214441114166445112210051122222211111114166825112210055111111111111114166222111110066666666666611114166122211110011111111111114744166112221110012222222222114554166111221150011111111111114554161111111110011115111511114444111444444410011266666666666111111411111410011262111111116111161414481410011262144444456112161414511410015262141111116112161414444410011262141166666112161411111110015262141111111112161444444410011262544471111112161111111110015262141111122111166666666660011262141161222211111111111110015262141161111111161444744410011262141161444444161411111410011262151161448444161414841410011266666661445544161414541410011111111111445544161414441410012222222211444444161411111410012222222211447444161444444410011111111111111111161111111110000000000000000000000000000000";
	        // Map 4
	        //String mapString = "000000000000000000000000000000022222112224126211212222222220022222112224426144111111111220012221111225416147566666661110011111111221116111161111444440012321111226666666661441444440021112111111111144441451444440022222111111111144441111444840066666666666666666666666661110022222222222222111222222221110022222222222222114111111111110022222222222222114122222221110022222222222222114111111111110022222222222222144166666666660022222222222222157162144222220011111111111111111161444111110011116666666666666661581111110044222222211222222221111122210044111111111111111111111122210044111111111111111111111222110044211122222266666661111222110044222166666661111111112221110044111111111161444111122211110014111111112161444111222211110014412111122161575111222111110058412111121161111112221111110015112112221161111112221119110011112111111161111112211111110011111111111111111111111111110000000000000000000000000000000";
	        // Map 5
	        
	        // on initialise la variable contenant le bloc actuel on lui attribant le caract�re num�ro 1 de la cha�ne
	        char block = mapString.charAt(n);
	        int x = 0, y = 0;
	        // pour y=0 qu'on incr�mente de 32 � chaque passage (on avance d'un bloc)
	        for(y=0; y <= 928; y+=32)
	        {
	            for(x=0; x <= 928; x+=32)
	            {
	                //System.out.println("x= "+x);
	                //System.out.println("y= "+y);
	                map[y][x] = block;


	                // on passe au caract�re d'apr�s de la string
	                //System.out.println("n= "+n);
	                if(n==899)
	                	n=0;
	                else
	                	n++;
	                block = mapString.charAt(n);

	                //System.out.println("block = "+map[y][x]);
	            }
	        }
			int Ix = 0;
			for(int j = 0; j <= 928; j+=32)
			{
				for (int i = 0; i <= 928; i+=32)
				{
					switch(map[j][i])
					{
					case '0': //Limit
						Ix = 0;
						break;
					case '1': //Dirt
						Ix = 16;
						break;
					case '2': //Rock
						Ix = 48;
						break;
					case '3': //Player
						Ix = 80;
						break;
					case '4': //Void
						Ix = 32;
						break;
					case '5': //Diamond
						Ix = 64;
						break;
					case '6': //Wall
						Ix = 96;
						break;
					case '7': //Mob go right
						Ix = 160;
						break;
					case '8': //Mob go left
						Ix = 144;
						break;
					case '9': //Exit
						Ix = 112;
						break;
					}
					g.drawImage(spriteSheet, i, j, i+32, j+32, Ix, 0, Ix+16, 16, Fenetre.getPane());
				    //Fenetre.getPane().repaint();
				}
			}
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
		
	/**public void buildMap(BufferedImage spriteSheet, Graphics g)
	{
		int n = 0;
        char map[][] = new char[992][992];
        // on r�cup�re la string de la map
        String mapString = "000000000000000000000000000000031222211111112111122222211190011122211111441444111111111150011111212111444444111111111110011221115111117411166666666660011122111111111111112111111110011112222111111111112121111110011111122111111111112121111110011111111111111112211121111110066666666666666111111166666660011112111111111121111111111110015111111122211121111111111110011111111111111121111111111110011444411111111111447411121110011474411111111111454411111110011441111111111111111111111110011441111211111111111111111110011111111111111111111111111110011111111111111111111111111110011111116666666666666666666660012111111111111111122111111110011111111111111111111111112110011111121111111211144111111110011111111111122111174111111110011511111112111111111111115110011111111111112111111111111110011111147111111111111211111110011111144111115111111111111110011111111111111111111111111110000000000000000000000000000000";
        // on initialise la variable contenant le bloc actuel on lui attribant le caract�re num�ro 1 de la cha�ne
        char block = mapString.charAt(n);
        int x = 0, y = 0;
        // pour y=0 qu'on incr�mente de 32 � chaque passage (on avance d'un bloc)
        for(y=0; y <= 928; y+=32)
        {
            for(x=0; x <= 928; x+=32)
            {
                //System.out.println("x= "+x);
                //System.out.println("y= "+y);
                map[y][x] = block;


                // on passe au caract�re d'apr�s de la string
                //System.out.println("n= "+n);
                if(n==899)
                	n=0;
                block = mapString.charAt(n);

                //System.out.println("block = "+map[y][x]);
            }
        }
		int Ix = 0, Iy=0;
		for(int j = 0; j < 960; j+=32)
		{
			for (int i = 0; i < 960; i+=32)
			{
				switch(map[j][i])
				{
				case '0': //Limit
					Ix = 0;
					Iy = Ix + 16;
					break;
				case '1': //Dirt
					Ix = 16;
					Iy = Ix + 16;
					break;
				case '2': //Rock
					Ix = 48;
					Iy = Ix + 16;
				case '3': //Player
					Ix = 555;
					Iy = Ix + 16;
					break;
				case '4': //Void
					Ix = 32;
					Iy = Ix + 16;
					break;
				case '5': //Diamond
					Ix = 64;
					Iy = Ix + 16;
					break;
				case '6': //Wall
					Ix = 96;
					Iy = Ix + 16;
					break;
				case '7': //Mob go right
					Ix = 160;
					Iy = Ix + 16;
					break;
				case '8': //Mob go left
					Ix = 144;
					Iy = Ix + 16;
					break;
				case '9': //Exit
					Ix = 112;
					Iy = Ix + 16;
					break;
				}
				g.drawImage(spriteSheet, i, j, i+32, j+32, Ix, Iy, Ix+16, Iy+16, Fenetre.getPane());
			}
		}
	}
}**/
