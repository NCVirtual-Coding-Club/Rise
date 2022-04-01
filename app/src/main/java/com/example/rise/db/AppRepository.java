package com.example.rise.db;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class AppRepository {
    private PlannedDao plannedDao;
    private UnplannedDao unplannedDao;

    private LiveData<List<Planned>> plannedList;
    private LiveData<List<Unplanned>> unplannedList;



    public AppRepository(Application application) {
        AppDatabase database = AppDatabase.getInstance(application);

        plannedDao = database.plannedDao();
        plannedList = plannedDao.getAllPlanned();

        unplannedDao = database.unplannedDao();
        unplannedList = unplannedDao.getAllUnplanned();
    }

    public void insert (Planned planned) {
        new InsertPlannedAsyncTask(plannedDao).execute(planned);
    }

    public void update (Planned planned) {
        new UpdatePlannedAsyncTask(plannedDao).execute(planned);
    }

    public void delete (Planned planned) {
        new DeletePlannedAsyncTask(plannedDao).execute(planned);
    }

    public void deleteAllPlanned() {
        new DeleteAllPlannedAsyncTask(plannedDao).execute();
    }

    public LiveData<List<Planned>> getPlannedList() {
        return plannedList;
    }

    private static class InsertPlannedAsyncTask extends AsyncTask<Planned, Void, Void> {
        private PlannedDao plannedDao;

        private InsertPlannedAsyncTask(PlannedDao plannedDao) {
            this.plannedDao = plannedDao;
        }

        @Override
        protected Void doInBackground(Planned... planneds) {
            plannedDao.insert(planneds[0]);
            return null;
        }
    }

    private static class UpdatePlannedAsyncTask extends AsyncTask<Planned, Void, Void> {
        private PlannedDao plannedDao;

        private UpdatePlannedAsyncTask(PlannedDao plannedDao) {
            this.plannedDao = plannedDao;
        }

        @Override
        protected Void doInBackground(Planned... planneds) {
            plannedDao.update(planneds[0]);
            return null;
        }
    }

    private static class DeletePlannedAsyncTask extends AsyncTask<Planned, Void, Void> {
        private PlannedDao plannedDao;

        private DeletePlannedAsyncTask(PlannedDao plannedDao) {
            this.plannedDao = plannedDao;
        }

        @Override
        protected Void doInBackground(Planned... planneds) {
            plannedDao.delete(planneds[0]);
            return null;
        }
    }
    private static class DeleteAllPlannedAsyncTask extends AsyncTask<Void, Void, Void> {
        private PlannedDao plannedDao;

        private DeleteAllPlannedAsyncTask(PlannedDao plannedDao) {
            this.plannedDao = plannedDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            plannedDao.deleteAllPlanned();
            return null;
        }
    }

    // Unplanned
    public void insert (Unplanned unplanned) {
        new InsertUnplannedAsyncTask(unplannedDao).execute(unplanned);
    }

    public void update (Unplanned unplanned) {
        new UpdateUnplannedAsyncTask(unplannedDao).execute(unplanned);
    }

    public void delete (Unplanned unplanned) {
        new DeleteUnplannedAsyncTask(unplannedDao).execute(unplanned);
    }

    public void deleteAllUnplanned() {
        new DeleteAllUnplannedAsyncTask(unplannedDao).execute();
    }

    public LiveData<List<Unplanned>> getUnplannedList() {
        return unplannedList;
    }

    private static class InsertUnplannedAsyncTask extends AsyncTask<Unplanned, Void, Void> {
        private UnplannedDao unplannedDao;

        private InsertUnplannedAsyncTask(UnplannedDao unplannedDao) {
            this.unplannedDao = unplannedDao;
        }

        @Override
        protected Void doInBackground(Unplanned... unplanneds) {
            unplannedDao.insert(unplanneds[0]);
            return null;
        }
    }

    private static class UpdateUnplannedAsyncTask extends AsyncTask<Unplanned, Void, Void> {
        private UnplannedDao unplannedDao;

        private UpdateUnplannedAsyncTask(UnplannedDao unplannedDao) {
            this.unplannedDao = unplannedDao;
        }

        @Override
        protected Void doInBackground(Unplanned... unplanneds) {
            unplannedDao.update(unplanneds[0]);
            return null;
        }
    }

    private static class DeleteUnplannedAsyncTask extends AsyncTask<Unplanned, Void, Void> {
        private UnplannedDao unplannedDao;

        private DeleteUnplannedAsyncTask(UnplannedDao unplannedDao) {
            this.unplannedDao = unplannedDao;
        }

        @Override
        protected Void doInBackground(Unplanned... unplanneds) {
            unplannedDao.delete(unplanneds[0]);
            return null;
        }
    }
    private static class DeleteAllUnplannedAsyncTask extends AsyncTask<Void, Void, Void> {
        private UnplannedDao unplannedDao;

        private DeleteAllUnplannedAsyncTask(UnplannedDao unplannedDao) {
            this.unplannedDao = unplannedDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            unplannedDao.deleteAllUnplanned();
            return null;
        }
    }
}
