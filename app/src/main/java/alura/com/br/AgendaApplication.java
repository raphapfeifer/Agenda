package alura.com.br;

import android.app.Application;

import alura.com.br.dao.AlunoDao;
import alura.com.br.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosTeste();
    }

    private void criaAlunosTeste() {
        AlunoDao dao = new AlunoDao();
        dao.salva(new Aluno("Raphael", "970286864", "rapha_pfeifer@yahoo.com.br"));
        dao.salva(new Aluno("Tosco", "123456", "gmail@gmail"));
    }
}
