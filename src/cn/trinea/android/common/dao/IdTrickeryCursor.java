
package cn.trinea.android.common.dao;

import android.database.Cursor;
import android.database.CursorWrapper;

public class IdTrickeryCursor extends CursorWrapper {
    public IdTrickeryCursor(Cursor cursor) {
        super(cursor);
    }

    @Override
    public int getColumnIndex(String columnName) {
        if ("_id".equals(columnName)) {
            return super.getColumnIndex("id");
        }

        return super.getColumnIndex(columnName);
    }

    @Override
    public int getColumnIndexOrThrow(String columnName) {
        if ("_id".equals(columnName)) {
            return super.getColumnIndexOrThrow("id");
        }

        return super.getColumnIndexOrThrow(columnName);
    }
}
