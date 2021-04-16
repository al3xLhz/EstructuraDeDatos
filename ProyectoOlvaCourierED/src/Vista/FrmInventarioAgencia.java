/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Sistema.OlvaCourier;

/**
 *
 * @author Alex
 */
public class FrmInventarioAgencia extends javax.swing.JFrame {

    /**
     * Creates new form InventarioAgencia
     */
    public FrmInventarioAgencia() {
        initComponents();
        llenarDatos();
        
    }

    public void llenarDatos(){
        etiquetaRPTAAmazonas.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Amazonas").getListaBolestas().getTamaño()));
        etiquetaRPTAAncash.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Ancash").getListaBolestas().getTamaño()));
        etiquetaRPTAApurimac.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Apurimac").getListaBolestas().getTamaño()));
        etiquetaRPTAArequipa.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Arequipa").getListaBolestas().getTamaño()));
        etiquetaRPTAAyacucho.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Ayacucho").getListaBolestas().getTamaño()));
        etiquetaRPTACajamarca.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Cajamarca").getListaBolestas().getTamaño()));
        etiquetaRPTACusco.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Cusco").getListaBolestas().getTamaño()));
        etiquetaRPTAHuancavelica.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Huancavelica").getListaBolestas().getTamaño()));
        etiquetaRPTAHuanuco.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Huanuco").getListaBolestas().getTamaño()));
        etiquetaRPTAIca.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Ica").getListaBolestas().getTamaño()));
        etiquetaRPTAJunin.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Junin").getListaBolestas().getTamaño()));
        etiquetaRPTALaLibertad.setText(String.valueOf(OlvaCourier.agencias.getAgencia("La Libertad").getListaBolestas().getTamaño()));
        etiquetaRPTALambayeque.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Lambayeque").getListaBolestas().getTamaño()));
        etiquetaRPTALima.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Lima").getListaBolestas().getTamaño()));
        etiquetaRPTALoreto.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Loreto").getListaBolestas().getTamaño()));
        etiquetaRPTAMadreDeDios.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Madre de Dios").getListaBolestas().getTamaño()));
        etiquetaRPTAMoquegua.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Moquegua").getListaBolestas().getTamaño()));
        etiquetaRPTAPasco.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Pasco").getListaBolestas().getTamaño()));
        etiquetaRPTAPiura.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Piura").getListaBolestas().getTamaño()));
        etiquetaRPTAPuno.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Puno").getListaBolestas().getTamaño()));
        etiquetaRPTASanMartin.setText(String.valueOf(OlvaCourier.agencias.getAgencia("San Martin").getListaBolestas().getTamaño()));
        etiquetaRPTATacna.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Tacna").getListaBolestas().getTamaño()));
        etiquetaRPTATumbes.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Tumbes").getListaBolestas().getTamaño()));
        etiquetaRPTAUcayali.setText(String.valueOf(OlvaCourier.agencias.getAgencia("Ucayali").getListaBolestas().getTamaño()));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        etiquetaInventario = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        etiquetaAmazonas = new javax.swing.JLabel();
        etiquetaAncash = new javax.swing.JLabel();
        etiquetaApurimac = new javax.swing.JLabel();
        etiquetaArequipa = new javax.swing.JLabel();
        etiquetaAyacucho = new javax.swing.JLabel();
        etiquetaCajamarca = new javax.swing.JLabel();
        etiquetaCusco = new javax.swing.JLabel();
        etiquetaHuancavelica = new javax.swing.JLabel();
        etiquetaHuanuco = new javax.swing.JLabel();
        etiquetaIca = new javax.swing.JLabel();
        etiquetaJunin = new javax.swing.JLabel();
        etiquetaLaLibertad = new javax.swing.JLabel();
        etiquetaLambayeque = new javax.swing.JLabel();
        etiquetaLima = new javax.swing.JLabel();
        etiquetaLoreto = new javax.swing.JLabel();
        etiquetaMadredeDios = new javax.swing.JLabel();
        etiquetaMoquegua = new javax.swing.JLabel();
        etiquetaPasco = new javax.swing.JLabel();
        etiquetaPiura = new javax.swing.JLabel();
        etiquetaPuno = new javax.swing.JLabel();
        etiquetaSanMartin = new javax.swing.JLabel();
        etiquetaTacna = new javax.swing.JLabel();
        etiquetaTumbes = new javax.swing.JLabel();
        etiquetaUcayali = new javax.swing.JLabel();
        etiquetaRPTAAmazonas = new javax.swing.JLabel();
        etiquetaRPTAAncash = new javax.swing.JLabel();
        etiquetaRPTAApurimac = new javax.swing.JLabel();
        etiquetaRPTAArequipa = new javax.swing.JLabel();
        etiquetaRPTAAyacucho = new javax.swing.JLabel();
        etiquetaRPTACajamarca = new javax.swing.JLabel();
        etiquetaRPTACusco = new javax.swing.JLabel();
        etiquetaRPTAHuancavelica = new javax.swing.JLabel();
        etiquetaRPTAHuanuco = new javax.swing.JLabel();
        etiquetaRPTAIca = new javax.swing.JLabel();
        etiquetaRPTAJunin = new javax.swing.JLabel();
        etiquetaRPTALaLibertad = new javax.swing.JLabel();
        etiquetaRPTALambayeque = new javax.swing.JLabel();
        etiquetaRPTALima = new javax.swing.JLabel();
        etiquetaRPTAPiura = new javax.swing.JLabel();
        etiquetaRPTALoreto = new javax.swing.JLabel();
        etiquetaRPTAMadreDeDios = new javax.swing.JLabel();
        etiquetaRPTAMoquegua = new javax.swing.JLabel();
        etiquetaRPTAPasco = new javax.swing.JLabel();
        etiquetaRPTAPuno = new javax.swing.JLabel();
        etiquetaRPTASanMartin = new javax.swing.JLabel();
        etiquetaRPTATacna = new javax.swing.JLabel();
        etiquetaRPTATumbes = new javax.swing.JLabel();
        etiquetaRPTAUcayali = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setLayout(new java.awt.BorderLayout());

        etiquetaInventario.setText("Inventario");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(etiquetaInventario)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(etiquetaInventario)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        fondo.add(header, java.awt.BorderLayout.NORTH);

        etiquetaAmazonas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaAmazonas.setText("Amazonas :");

        etiquetaAncash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaAncash.setText("Ancash : ");

        etiquetaApurimac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaApurimac.setText("Apurimac : ");

        etiquetaArequipa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaArequipa.setText("Arequipa :");

        etiquetaAyacucho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaAyacucho.setText("Ayacucho : ");

        etiquetaCajamarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaCajamarca.setText("Cajamarca :");

        etiquetaCusco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaCusco.setText("Cusco :");

        etiquetaHuancavelica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaHuancavelica.setText("Huancavelica :");

        etiquetaHuanuco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaHuanuco.setText("Huanuco :");

        etiquetaIca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaIca.setText("Ica :");

        etiquetaJunin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaJunin.setText("Junin :");

        etiquetaLaLibertad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaLaLibertad.setText("La Libertad :");

        etiquetaLambayeque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaLambayeque.setText("Lambayeque :");

        etiquetaLima.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaLima.setText("Lima :");

        etiquetaLoreto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaLoreto.setText("Loreto : ");

        etiquetaMadredeDios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaMadredeDios.setText("Madre de Dios :");

        etiquetaMoquegua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaMoquegua.setText("Moquegua :");

        etiquetaPasco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaPasco.setText("Pasco :");

        etiquetaPiura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaPiura.setText("Piura :");

        etiquetaPuno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaPuno.setText("Puno :");

        etiquetaSanMartin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaSanMartin.setText("San Martin :");

        etiquetaTacna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaTacna.setText("Tacna :");

        etiquetaTumbes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaTumbes.setText("Tumbes :");

        etiquetaUcayali.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaUcayali.setText("Ucayali :");

        etiquetaRPTAAmazonas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAAmazonas.setText("0");

        etiquetaRPTAAncash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAAncash.setText("0");

        etiquetaRPTAApurimac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAApurimac.setText("0");

        etiquetaRPTAArequipa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAArequipa.setText("0");

        etiquetaRPTAAyacucho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAAyacucho.setText("0");

        etiquetaRPTACajamarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTACajamarca.setText("0");

        etiquetaRPTACusco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTACusco.setText("0");

        etiquetaRPTAHuancavelica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAHuancavelica.setText("0");

        etiquetaRPTAHuanuco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAHuanuco.setText("0");

        etiquetaRPTAIca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAIca.setText("0");

        etiquetaRPTAJunin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAJunin.setText("0");

        etiquetaRPTALaLibertad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTALaLibertad.setText("0");

        etiquetaRPTALambayeque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTALambayeque.setText("0");

        etiquetaRPTALima.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTALima.setText("0");

        etiquetaRPTAPiura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAPiura.setText("0");

        etiquetaRPTALoreto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTALoreto.setText("0");

        etiquetaRPTAMadreDeDios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAMadreDeDios.setText("0");

        etiquetaRPTAMoquegua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAMoquegua.setText("0");

        etiquetaRPTAPasco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAPasco.setText("0");

        etiquetaRPTAPuno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAPuno.setText("0");

        etiquetaRPTASanMartin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTASanMartin.setText("0");

        etiquetaRPTATacna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTATacna.setText("0");

        etiquetaRPTATumbes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTATumbes.setText("0");

        etiquetaRPTAUcayali.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaRPTAUcayali.setText("0");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaJunin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaIca, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAmazonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaAncash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaApurimac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaArequipa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaAyacucho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaCajamarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaCusco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaHuancavelica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaHuanuco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaLaLibertad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaRPTAAmazonas)
                    .addComponent(etiquetaRPTAAncash)
                    .addComponent(etiquetaRPTAApurimac)
                    .addComponent(etiquetaRPTAArequipa)
                    .addComponent(etiquetaRPTAAyacucho)
                    .addComponent(etiquetaRPTACajamarca)
                    .addComponent(etiquetaRPTACusco)
                    .addComponent(etiquetaRPTAHuancavelica)
                    .addComponent(etiquetaRPTAHuanuco)
                    .addComponent(etiquetaRPTAIca)
                    .addComponent(etiquetaRPTAJunin)
                    .addComponent(etiquetaRPTALaLibertad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaPasco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etiquetaTumbes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaTacna, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etiquetaLambayeque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaLima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaLoreto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaMadredeDios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaPiura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaPuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaSanMartin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaUcayali, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaMoquegua, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaRPTALambayeque)
                    .addComponent(etiquetaRPTALima)
                    .addComponent(etiquetaRPTALoreto)
                    .addComponent(etiquetaRPTAMadreDeDios)
                    .addComponent(etiquetaRPTAMoquegua)
                    .addComponent(etiquetaRPTAPasco)
                    .addComponent(etiquetaRPTAPiura)
                    .addComponent(etiquetaRPTAPuno)
                    .addComponent(etiquetaRPTASanMartin)
                    .addComponent(etiquetaRPTATacna)
                    .addComponent(etiquetaRPTATumbes)
                    .addComponent(etiquetaRPTAUcayali))
                .addGap(43, 43, 43))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaRPTAMoquegua)
                            .addComponent(etiquetaMoquegua))
                        .addGap(24, 24, 24)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPasco)
                            .addComponent(etiquetaRPTAPasco))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPiura)
                            .addComponent(etiquetaRPTAPiura))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPuno)
                            .addComponent(etiquetaRPTAPuno))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaSanMartin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaRPTASanMartin))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaTacna)
                            .addComponent(etiquetaRPTATacna))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaTumbes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaRPTATumbes))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaUcayali)
                            .addComponent(etiquetaRPTAUcayali)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaAmazonas)
                            .addComponent(etiquetaRPTAAmazonas)
                            .addComponent(etiquetaLambayeque, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaRPTALambayeque))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaAncash)
                            .addComponent(etiquetaRPTAAncash)
                            .addComponent(etiquetaLima)
                            .addComponent(etiquetaRPTALima))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaApurimac)
                            .addComponent(etiquetaRPTAApurimac)
                            .addComponent(etiquetaLoreto)
                            .addComponent(etiquetaRPTALoreto))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaArequipa)
                            .addComponent(etiquetaRPTAArequipa)
                            .addComponent(etiquetaMadredeDios)
                            .addComponent(etiquetaRPTAMadreDeDios))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaAyacucho)
                            .addComponent(etiquetaRPTAAyacucho))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaCajamarca)
                            .addComponent(etiquetaRPTACajamarca))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaCusco)
                            .addComponent(etiquetaRPTACusco))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaHuancavelica)
                            .addComponent(etiquetaRPTAHuancavelica))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaHuanuco, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaRPTAHuanuco))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaIca)
                            .addComponent(etiquetaRPTAIca))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaJunin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaRPTAJunin))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaLaLibertad)
                            .addComponent(etiquetaRPTALaLibertad))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        fondo.add(body, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmInventarioAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInventarioAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInventarioAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInventarioAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInventarioAgencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel etiquetaAmazonas;
    private javax.swing.JLabel etiquetaAncash;
    private javax.swing.JLabel etiquetaApurimac;
    private javax.swing.JLabel etiquetaArequipa;
    private javax.swing.JLabel etiquetaAyacucho;
    private javax.swing.JLabel etiquetaCajamarca;
    private javax.swing.JLabel etiquetaCusco;
    private javax.swing.JLabel etiquetaHuancavelica;
    private javax.swing.JLabel etiquetaHuanuco;
    private javax.swing.JLabel etiquetaIca;
    private javax.swing.JLabel etiquetaInventario;
    private javax.swing.JLabel etiquetaJunin;
    private javax.swing.JLabel etiquetaLaLibertad;
    private javax.swing.JLabel etiquetaLambayeque;
    private javax.swing.JLabel etiquetaLima;
    private javax.swing.JLabel etiquetaLoreto;
    private javax.swing.JLabel etiquetaMadredeDios;
    private javax.swing.JLabel etiquetaMoquegua;
    private javax.swing.JLabel etiquetaPasco;
    private javax.swing.JLabel etiquetaPiura;
    private javax.swing.JLabel etiquetaPuno;
    private javax.swing.JLabel etiquetaRPTAAmazonas;
    private javax.swing.JLabel etiquetaRPTAAncash;
    private javax.swing.JLabel etiquetaRPTAApurimac;
    private javax.swing.JLabel etiquetaRPTAArequipa;
    private javax.swing.JLabel etiquetaRPTAAyacucho;
    private javax.swing.JLabel etiquetaRPTACajamarca;
    private javax.swing.JLabel etiquetaRPTACusco;
    private javax.swing.JLabel etiquetaRPTAHuancavelica;
    private javax.swing.JLabel etiquetaRPTAHuanuco;
    private javax.swing.JLabel etiquetaRPTAIca;
    private javax.swing.JLabel etiquetaRPTAJunin;
    private javax.swing.JLabel etiquetaRPTALaLibertad;
    private javax.swing.JLabel etiquetaRPTALambayeque;
    private javax.swing.JLabel etiquetaRPTALima;
    private javax.swing.JLabel etiquetaRPTALoreto;
    private javax.swing.JLabel etiquetaRPTAMadreDeDios;
    private javax.swing.JLabel etiquetaRPTAMoquegua;
    private javax.swing.JLabel etiquetaRPTAPasco;
    private javax.swing.JLabel etiquetaRPTAPiura;
    private javax.swing.JLabel etiquetaRPTAPuno;
    private javax.swing.JLabel etiquetaRPTASanMartin;
    private javax.swing.JLabel etiquetaRPTATacna;
    private javax.swing.JLabel etiquetaRPTATumbes;
    private javax.swing.JLabel etiquetaRPTAUcayali;
    private javax.swing.JLabel etiquetaSanMartin;
    private javax.swing.JLabel etiquetaTacna;
    private javax.swing.JLabel etiquetaTumbes;
    private javax.swing.JLabel etiquetaUcayali;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel header;
    // End of variables declaration//GEN-END:variables
}
