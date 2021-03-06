// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class XPropertyEvent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("atom"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("time"),
        Constants$root.C_INT$LAYOUT.withName("state"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XPropertyEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XPropertyEvent.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)XPropertyEvent.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        XPropertyEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XPropertyEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XPropertyEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XPropertyEvent.serial$VH;
    }
    public static long serial$get(MemorySegment seg) {
        return (long)XPropertyEvent.serial$VH.get(seg);
    }
    public static void serial$set( MemorySegment seg, long x) {
        XPropertyEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XPropertyEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XPropertyEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XPropertyEvent.send_event$VH;
    }
    public static int send_event$get(MemorySegment seg) {
        return (int)XPropertyEvent.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, int x) {
        XPropertyEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XPropertyEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XPropertyEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XPropertyEvent.display$VH;
    }
    public static MemoryAddress display$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)XPropertyEvent.display$VH.get(seg);
    }
    public static void display$set( MemorySegment seg, MemoryAddress x) {
        XPropertyEvent.display$VH.set(seg, x);
    }
    public static MemoryAddress display$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)XPropertyEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemoryAddress x) {
        XPropertyEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XPropertyEvent.window$VH;
    }
    public static long window$get(MemorySegment seg) {
        return (long)XPropertyEvent.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, long x) {
        XPropertyEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XPropertyEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XPropertyEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle atom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("atom"));
    public static VarHandle atom$VH() {
        return XPropertyEvent.atom$VH;
    }
    public static long atom$get(MemorySegment seg) {
        return (long)XPropertyEvent.atom$VH.get(seg);
    }
    public static void atom$set( MemorySegment seg, long x) {
        XPropertyEvent.atom$VH.set(seg, x);
    }
    public static long atom$get(MemorySegment seg, long index) {
        return (long)XPropertyEvent.atom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void atom$set(MemorySegment seg, long index, long x) {
        XPropertyEvent.atom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return XPropertyEvent.time$VH;
    }
    public static long time$get(MemorySegment seg) {
        return (long)XPropertyEvent.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, long x) {
        XPropertyEvent.time$VH.set(seg, x);
    }
    public static long time$get(MemorySegment seg, long index) {
        return (long)XPropertyEvent.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, long x) {
        XPropertyEvent.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return XPropertyEvent.state$VH;
    }
    public static int state$get(MemorySegment seg) {
        return (int)XPropertyEvent.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, int x) {
        XPropertyEvent.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)XPropertyEvent.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        XPropertyEvent.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


