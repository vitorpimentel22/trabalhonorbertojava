public class Cpf {

    private String cpf;
    private String S1, S2, S3, S4, S5, S6, S7, S8, S9, confere = "";
    private int N1, N2, N3, N4, N5, N6, N7, N8, N9, verificador1, verificador2;

    public boolean validarCpf(String cpf) {

      S1 = cpf.substring(0, 1); N1 = Integer.parseInt(S1);
      S2 = cpf.substring(1, 2); N2 = Integer.parseInt(S2);
      S3 = cpf.substring(2, 3); N3 = Integer.parseInt(S3);
      S4 = cpf.substring(4, 5); N4 = Integer.parseInt(S4);
      S5 = cpf.substring(5, 6); N5 = Integer.parseInt(S5);
      S6 = cpf.substring(6, 7); N6 = Integer.parseInt(S6);
      S7 = cpf.substring(8, 9); N7 = Integer.parseInt(S7);
      S8 = cpf.substring(9, 10); N8 = Integer.parseInt(S8);
      S9 = cpf.substring(10, 11); N9 = Integer.parseInt(S9);

      verificador1 = (N1 * 10 + N2 * 9 + N3 * 8 + N4 * 7 + N5 * 6 + N6 * 5 + N7 * 4 + N8 * 3 + N9 * 2);
      if ((verificador1 % 11) < 2) {
        verificador1 = 0;
      }else {
        verificador1 = 11 - (verificador1 % 11);
      }


        verificador2 = (N1 * 11 + N2 * 10 + N3 * 9 + N4 * 8 + N5 * 7 + N6 * 6 + N7 * 5 + N8 * 4 + N9 * 3 + verificador1 * 2);
        if ((verificador2 % 11) < 2) {
          verificador2 = 0;
        }else{
          verificador2 = 11 - (verificador2 % 11);
        }


          confere = (S1 + S2 + S3 + "." + S4 + S5 + S6 + "." + S7 + S8 + S9 + "-" + verificador1 + "" + verificador2);

          if (confere.equals(cpf)){
            //System.out.println("CPF Válido CPF: " + cpf + "confere" + confere);
            return true;
          } else {
            //System.out.println("CPF Inválido CPF:" + cpf + "confere" + confere);
            return false;
          }

    }

  }
