package dao;

import entity.NhanVien;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NhanVienDao extends Remote {
    NhanVien layNhanVienTheoMa(String maNhanVien) throws RemoteException;
}
