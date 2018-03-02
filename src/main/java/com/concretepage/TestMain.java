package com.concretepage;

import java.util.List;

import org.hibernate.Session;

public class TestMain {
  public static void main(String[] args) {
	 
	 Session session = HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	 /*session.save(person);*/
	 
	 /*PrtcptFlVersion prtcptFlVersion =  (PrtcptFlVersion) session.get(PrtcptFlVersion.class, 1);
	 System.out.println(prtcptFlVersion);
	 //System.out.println(prtcptFlVersion);
	 System.out.println(prtcptFlVersion.getPrtcptProf().getIntIssAcq().toString());*/
	 
	 IntIssAcq i = (IntIssAcq) session.get(IntIssAcq.class, 30004);
			 //System.out.println(i);
			 List<PrtcptProf> l = i.getPrtcptProfList();
			 
			 for (PrtcptProf prtcptProf : l) {
				System.out.println(prtcptProf.getPrtcptFlVersionList());
			}
	 
	 session.getTransaction().commit();
	 session.close();
	 System.out.println("Done");
  }
}
