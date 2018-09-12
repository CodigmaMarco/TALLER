package Modelo;

import Controlador.Coordinador;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TablaProcesos {
     private Coordinador miCoordinador;
     private boolean[] editable = {false,false,false,true,false,false};
    
    
    public void visualizar(JTable tabla, int orden){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        
        DefaultTableModel dt = new DefaultTableModel(new String[]{"ID Proceso", "Area", "Proceso", "Status", "Imagen","Cargar"}, 0) {
            
            Class[] types = new Class[]{
                java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class,java.lang.Boolean.class,java.lang.Object.class
            };
 
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
            
            public boolean isCellEditable(int row, int column){
                return editable[column];
            }
        };
        
        JButton btn_visualizar = new JButton("Subir Imagen");
        btn_visualizar.setName("v");
        
        ArrayList<procesoVo> proceso = Coordinador.getProcesos(orden);

        if(proceso.size() > 0){
        for(int i=0; i< proceso.size(); i++){
        Object fila[] = new Object[6];
        
        fila[0] = proceso.get(i).getIdproceso();
        fila[1] = proceso.get(i).getNom_area();
        fila[2] = proceso.get(i).getNom_servicio();
        if(proceso.get(i).getStatus().equals("procesando")){ fila[3] = false;}
        else if(proceso.get(i).getStatus().equals("terminado")){fila[3] = true;}

        if(proceso.get(i).getImagen_proceso().isEmpty()){ fila[4] = false;}
        else{fila[4] = true;}
        
        fila[5] = btn_visualizar;

        dt.addRow(fila);
        
        }
        
        }
        
        tabla.setModel(dt);
    
    }
}
