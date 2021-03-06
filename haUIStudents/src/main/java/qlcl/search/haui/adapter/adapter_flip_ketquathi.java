package qlcl.search.haui.adapter;

import java.util.List;

import qlcl.search.haui.obj.MonHoc;
import qlcl.search.haui.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class adapter_flip_ketquathi extends BaseAdapter {
	List<MonHoc> listKetQuaThi;
	Context ct;
	LayoutInflater inflater;

	public adapter_flip_ketquathi(List<MonHoc> listKetQuaThi, Context ct,
			LayoutInflater inflater) {
		super();
		this.listKetQuaThi = listKetQuaThi;
		this.ct = ct;
		this.inflater = inflater;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listKetQuaThi.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		MonHoc mh = listKetQuaThi.get(position);
		View v;
		if (convertView == null) {
			v = inflater.inflate(R.layout.adapter_detail_ketquathi, null);
			TextView tv_monhoc = (TextView) v
					.findViewById(R.id.tv_ChiTietMonthi_KetquaThi);
			TextView tv_maLopDocLap = (TextView) v
					.findViewById(R.id.tv_maLopDocLap);
			TextView tv_soTinChi = (TextView) v.findViewById(R.id.tv_SoTinChi);
			TextView tv_diemTBKT = (TextView) v.findViewById(R.id.tv_DiemTBKT);
			TextView tv_diemThiLan1 = (TextView) v
					.findViewById(R.id.tv_DiemThiLan1);
			TextView tv_diemThiLan2 = (TextView) v
					.findViewById(R.id.tv_DiemThiLan2);
			TextView tv_diemTBC = (TextView) v.findViewById(R.id.tv_DiemTBChung);
			TextView tv_diemTinChi = (TextView) v.findViewById(R.id.tv_DiemTinChi);
			TextView tv_hocKi = (TextView) v.findViewById(R.id.tv_HocKi);
			TextView tv_ghiChu = (TextView) v
					.findViewById(R.id.tv_GhiChu_KetQuaThi);

			tv_monhoc.setText(mh.getTenMonHoc());
			tv_maLopDocLap.setText(mh.getMaLopDoclap());
			tv_soTinChi.setText(mh.getSoTinChi());
			tv_diemTBKT.setText(mh.getDiemTBKT());
			tv_diemThiLan1.setText(mh.getDiemThiL1());
			tv_diemThiLan2.setText(mh.getDiemThiL2());
			tv_diemTBC.setText(mh.getDiemTBC());
			tv_diemTinChi.setText(mh.getDiemTinChi());
			tv_hocKi.setText(mh.getHocKi());
			tv_ghiChu.setText(mh.getGhiChu());
		}else{
			v=convertView;
			TextView tv_monhoc = (TextView) v
					.findViewById(R.id.tv_ChiTietMonthi_KetquaThi);
			TextView tv_maLopDocLap = (TextView) v
					.findViewById(R.id.tv_maLopDocLap);
			TextView tv_soTinChi = (TextView) v.findViewById(R.id.tv_SoTinChi);
			TextView tv_diemTBKT = (TextView) v.findViewById(R.id.tv_DiemTBKT);
			TextView tv_diemThiLan1 = (TextView) v
					.findViewById(R.id.tv_DiemThiLan1);
			TextView tv_diemThiLan2 = (TextView) v
					.findViewById(R.id.tv_DiemThiLan2);
			TextView tv_diemTBC = (TextView) v.findViewById(R.id.tv_DiemTBChung);
			TextView tv_diemTinChi = (TextView) v.findViewById(R.id.tv_DiemTinChi);
			TextView tv_hocKi = (TextView) v.findViewById(R.id.tv_HocKi);
			TextView tv_ghiChu = (TextView) v
					.findViewById(R.id.tv_GhiChu_KetQuaThi);

			tv_monhoc.setText(mh.getTenMonHoc());
			tv_maLopDocLap.setText(mh.getMaLopDoclap());
			tv_soTinChi.setText(mh.getSoTinChi());
			tv_diemTBKT.setText(mh.getDiemTBKT());
			tv_diemThiLan1.setText(mh.getDiemThiL1());
			tv_diemThiLan2.setText(mh.getDiemThiL2());
			tv_diemTBC.setText(mh.getDiemTBC());
			tv_diemTinChi.setText(mh.getDiemTinChi());
			tv_hocKi.setText(mh.getHocKi());
			tv_ghiChu.setText(mh.getGhiChu());
		}

	

		// container.addView(v);
		return v;
	}

}
