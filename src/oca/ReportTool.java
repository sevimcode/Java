package oca;


class ReportTool extends Tool implements Exportable {
    public void export(){
        System.out.println ("rtoll export");
    }
    public static void callExport (Exportable ex){
        ex.export ();
    }

    public static void main( String[] args ) {
        Tool atool = new ReportTool ();
        Tool btool = new Tool ();
        callExport (atool);
        callExport (btool);
    }
}
