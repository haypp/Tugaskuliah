package grosirin;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class listbarang extends javax.swing.JFrame {
    public String GlobalBarang,barang1,barang2,barang3,barang4,barang5;
    Connection con;
    PreparedStatement pst;
    Statement stm;
    ResultSet rs;
    JFileChooser jfc;
    File file;
    
   public listbarang() {
        initComponents();
        setIconImage();
        setIconcart();
        setbarang();
   }    
   public void setIconImage()
    {
       Image img = new ImageIcon("src\\image\\iconlogo.png").getImage();
       Image imgRsz = img.getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_DEFAULT);
       ImageIcon logoIcon = new ImageIcon(imgRsz); 
       lbImage.setIcon(logoIcon);
    }
   public void setIconcart()
    {
       Image img = new ImageIcon("src\\image\\trolley.png").getImage();
       Image imgRsz = img.getScaledInstance(btCart.getWidth(), btCart.getHeight(), Image.SCALE_DEFAULT);
       ImageIcon logoIcon = new ImageIcon(imgRsz); 
       btCart.setIcon(logoIcon);
    }
   
   public void settitlebarnag(){
       homepage hp = new homepage();
       String barang = homepage.GlobalList ;
       
       try {        
            String sql = "select namaBarang, harga, photopath,idBarang from barang where idJenisBarang ="+  barang;
            con = Koneksi.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
                while(rs.next()){
                    
                }
       }catch (Exception e) {
            System.out.println(e.getMessage());
        }
   }
   public void setbarang(){
       System.out.println("TES barang");
       homepage hp = new homepage();
       String barang = homepage.GlobalList;
       System.out.println("TES barang" + barang);
       
       try {        
            String sql = "select namaBarang, harga, photopath,idBarang from barang where idJenisBarang ="+  barang;
            con = Koneksi.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
                while(rs.next()){
                    
                }
                rs.absolute(1);
                llbNama1.setText (rs.getString("namaBarang"));
                llbHarga1.setText ("Rp. "+rs.getString("harga"));
                String tmtpoto = rs.getString("photopath");
                barang1 = rs.getString("idBarang");
                    try {
                        Toolkit toolkit=Toolkit.getDefaultToolkit();
                        String path=new File(".").getCanonicalPath();
                        Image image=toolkit.getImage(path+"/src/Image/barang/"+tmtpoto); 
                        Image imagedResized=image.getScaledInstance(ggb1.getWidth(), ggb1.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon icon=new ImageIcon(imagedResized);
                        ggb1.setIcon(icon); 
                    } catch (Exception e) {
                      System.out.println(e.getMessage());
                    }
                rs.absolute(2);
                    lbNama2.setText (rs.getString("namaBarang"));
                    lbHarga2.setText ("Rp. "+rs.getString("harga"));
                    tmtpoto = rs.getString("photopath");
                    barang2 = rs.getString("idBarang");
                    try {
                        Toolkit toolkit=Toolkit.getDefaultToolkit();
                        String path=new File(".").getCanonicalPath();
                        Image image=toolkit.getImage(path+"/src/Image/barang/"+tmtpoto); 
                        Image imagedResized=image.getScaledInstance(gb2.getWidth(), gb2.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon icon=new ImageIcon(imagedResized);
                        gb2.setIcon(icon); 
                    } catch (Exception e) {
                      System.out.println(e.getMessage());
                    }
                    rs.absolute(3);
                    lbNama3.setText (rs.getString("namaBarang"));
                    lbHarga3.setText ("Rp. "+rs.getString("harga"));
                    tmtpoto = rs.getString("photopath");
                    barang3 = rs.getString("idBarang");
                    try {
                        Toolkit toolkit=Toolkit.getDefaultToolkit();
                        String path=new File(".").getCanonicalPath();
                        Image image=toolkit.getImage(path+"/src/Image/barang/"+tmtpoto); 
                        Image imagedResized=image.getScaledInstance(gb3.getWidth(), gb3.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon icon=new ImageIcon(imagedResized);
                        gb3.setIcon(icon); 
                    } catch (Exception e) {
                      System.out.println(e.getMessage());
                    }
                    rs.absolute(4);
                    lbNama4.setText (rs.getString("namaBarang"));
                    lbHarga4.setText ("Rp. "+rs.getString("harga"));
                    tmtpoto = rs.getString("photopath");
                    barang4 = rs.getString("idBarang");
                    try {
                        Toolkit toolkit=Toolkit.getDefaultToolkit();
                        String path=new File(".").getCanonicalPath();
                        Image image=toolkit.getImage(path+"/src/Image/barang/"+tmtpoto); 
                        Image imagedResized=image.getScaledInstance(gb4.getWidth(), gb4.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon icon=new ImageIcon(imagedResized);
                        gb4.setIcon(icon); 
                    } catch (Exception e) {
                      System.out.println(e.getMessage());
                    }
                    rs.absolute(5);
                    lbNama5.setText (rs.getString("namaBarang"));
                    lbHarga5.setText ("Rp. "+rs.getString("harga"));
                    tmtpoto = rs.getString("photopath");
                    barang5 = rs.getString("idBarang");
                    try {
                        Toolkit toolkit=Toolkit.getDefaultToolkit();
                        String path=new File(".").getCanonicalPath();
                        Image image=toolkit.getImage(path+"/src/Image/barang/"+tmtpoto); 
                        Image imagedResized=image.getScaledInstance(gb5.getWidth(), gb5.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon icon=new ImageIcon(imagedResized);
                        gb5.setIcon(icon); 
                    } catch (Exception e) {
                      System.out.println(e.getMessage());
                    }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btCart = new javax.swing.JButton();
        tb4 = new javax.swing.JButton();
        tb1 = new javax.swing.JButton();
        tb7 = new javax.swing.JButton();
        tb6 = new javax.swing.JButton();
        tb3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        tb5 = new javax.swing.JButton();
        tb2 = new javax.swing.JButton();
        lbImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        llbNama1 = new javax.swing.JLabel();
        llbHarga1 = new javax.swing.JLabel();
        ggb1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lbNama2 = new javax.swing.JLabel();
        lbHarga2 = new javax.swing.JLabel();
        gb2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lbNama3 = new javax.swing.JLabel();
        lbHarga3 = new javax.swing.JLabel();
        gb3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lbNama4 = new javax.swing.JLabel();
        lbHarga4 = new javax.swing.JLabel();
        gb4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lbNama5 = new javax.swing.JLabel();
        lbHarga5 = new javax.swing.JLabel();
        gb5 = new javax.swing.JButton();
        lbJenis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btCart.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N

        tb4.setBackground(new java.awt.Color(255, 255, 255));
        tb4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb4.setText("MINYAK");
        tb4.setPreferredSize(new java.awt.Dimension(143, 40));

        tb1.setBackground(new java.awt.Color(255, 255, 255));
        tb1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb1.setText("MINYAK");
        tb1.setBorder(null);
        tb1.setPreferredSize(new java.awt.Dimension(143, 40));

        tb7.setBackground(new java.awt.Color(255, 255, 255));
        tb7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb7.setText("MINYAK");
        tb7.setPreferredSize(new java.awt.Dimension(143, 40));

        tb6.setBackground(new java.awt.Color(255, 255, 255));
        tb6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb6.setText("MINYAK");
        tb6.setPreferredSize(new java.awt.Dimension(143, 40));

        tb3.setBackground(new java.awt.Color(255, 255, 255));
        tb3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb3.setText("MINYAK");
        tb3.setPreferredSize(new java.awt.Dimension(143, 40));

        jTextField1.setBackground(new java.awt.Color(209, 219, 252));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("  Search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        tb5.setBackground(new java.awt.Color(255, 255, 255));
        tb5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb5.setText("MINYAK");
        tb5.setPreferredSize(new java.awt.Dimension(143, 40));

        tb2.setBackground(new java.awt.Color(255, 255, 255));
        tb2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb2.setText("MIE");
        tb2.setPreferredSize(new java.awt.Dimension(143, 40));
        tb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        llbNama1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        llbNama1.setText("Mie Sedaap");

        llbHarga1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        llbHarga1.setText("Rp. 2500");

        ggb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ggb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ggb1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(llbNama1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(llbHarga1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ggb1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(llbNama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(llbHarga1)
                .addGap(135, 135, 135))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lbNama2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNama2.setText("Mie Sedaap");

        lbHarga2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbHarga2.setText("Rp. 2500");

        gb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gb2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbNama2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(lbHarga2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(gb2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNama2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHarga2)
                .addGap(135, 135, 135))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbNama3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNama3.setText("Mie Sedaap");

        lbHarga3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbHarga3.setText("Rp. 2500");

        gb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbNama3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHarga3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gb3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(gb3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNama3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHarga3)
                .addGap(135, 135, 135))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lbNama4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNama4.setText("Mie Sedaap");

        lbHarga4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbHarga4.setText("Rp. 2500");

        gb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbNama4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gb4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHarga4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(gb4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNama4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHarga4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lbNama5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNama5.setText("Mie Sedaap");

        lbHarga5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbHarga5.setText("Rp. 2500");

        gb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbNama5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHarga5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gb5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(gb5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNama5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHarga5)
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        lbJenis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbJenis.setText("Jenis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(btCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(tb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(tb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(tb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbJenis))))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lbJenis)
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("1366");
        jPanel1.getAccessibleContext().setAccessibleDescription("768");

        getAccessibleContext().setAccessibleName("1366");
        getAccessibleContext().setAccessibleDescription("768");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb2ActionPerformed

    private void ggb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ggb1ActionPerformed
        GlobalBarang = barang1;
        this.dispose();
        viewbarang hp = new viewbarang();
        hp.setVisible(true);
    }//GEN-LAST:event_ggb1ActionPerformed

    private void gb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gb2ActionPerformed

    private void gb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gb3ActionPerformed

    private void gb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gb4ActionPerformed

    private void gb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gb5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(listbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listbarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCart;
    private javax.swing.JButton gb2;
    private javax.swing.JButton gb3;
    private javax.swing.JButton gb4;
    private javax.swing.JButton gb5;
    private javax.swing.JButton ggb1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbHarga2;
    private javax.swing.JLabel lbHarga3;
    private javax.swing.JLabel lbHarga4;
    private javax.swing.JLabel lbHarga5;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbJenis;
    private javax.swing.JLabel lbNama2;
    private javax.swing.JLabel lbNama3;
    private javax.swing.JLabel lbNama4;
    private javax.swing.JLabel lbNama5;
    private javax.swing.JLabel llbHarga1;
    private javax.swing.JLabel llbNama1;
    private javax.swing.JButton tb1;
    private javax.swing.JButton tb2;
    private javax.swing.JButton tb3;
    private javax.swing.JButton tb4;
    private javax.swing.JButton tb5;
    private javax.swing.JButton tb6;
    private javax.swing.JButton tb7;
    // End of variables declaration//GEN-END:variables
}
